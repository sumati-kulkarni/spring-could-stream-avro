package com.citi;

import com.citi.model.EnrichEmployee;
import com.citi.schema.EMPLOYEE;
import com.citi.schema.DEPARTMENT;
import com.citi.schema.RESULT;
import lombok.extern.log4j.Log4j2;
import org.apache.kafka.common.serialization.Serdes;
import org.apache.kafka.streams.kstream.KTable;
import org.apache.kafka.streams.kstream.Materialized;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.schema.registry.client.EnableSchemaRegistryClient;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.support.serializer.JsonSerde;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;
import java.util.function.BiFunction;

@Log4j2
@SpringBootApplication
@EnableSchemaRegistryClient
public class PosnEnrichApplication {

	public static void main(String[] args) {
		SpringApplication.run(PosnEnrichApplication.class, args);
	}

	@Bean
	public BiFunction<KTable<String, EMPLOYEE>, KTable<String, DEPARTMENT>, KTable<String, RESULT>> enrichEmployee() {

		return (leftSource, rightSource) -> leftSource.join(rightSource,
				EMPLOYEE::getDEPTID,
				(emp, dept) -> {
					RESULT result = new RESULT();
					result.setID(emp.getID());
					result.setDEPTID(dept.getID());
					result.setENAME(emp.getENAME());
					result.setDNAME(dept.getDNAME());
                    result.setCREATEDDATE(LocalDateTime.now().atZone(ZoneId.systemDefault()).toInstant());
                    result.setMODIFIEDDATE(LocalDateTime.now().atZone(ZoneId.systemDefault()).toInstant());
					return result;
				},
				Materialized.with(Serdes.String(), new JsonSerde<>(RESULT.class))/* ValueJoiner */
		);
	}
}
