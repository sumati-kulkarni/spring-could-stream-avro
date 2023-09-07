package com.citi;

import com.citi.model.EnrichEmployee;
import com.citi.model.Employee1;
import com.citi.model.Department1;
import lombok.extern.log4j.Log4j2;
import org.apache.kafka.streams.kstream.KTable;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.schema.registry.client.EnableSchemaRegistryClient;
import org.springframework.context.annotation.Bean;

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
	public BiFunction<KTable<String, Employee1>, KTable<String, Department1>, KTable<String, EnrichEmployee>> enrichEmployee() {

		return (leftSource, rightSource) -> leftSource.join(rightSource,
				Employee1::getDeptId,
				(emp, dept) -> {
					EnrichEmployee enrichEmployee = new EnrichEmployee();
					enrichEmployee.setEid(emp.getId());
					enrichEmployee.setDeptId(dept.getId());
					enrichEmployee.setEname(emp.getEname());
					enrichEmployee.setDname(dept.getDname());
                    enrichEmployee.setCreatedDate(new Date());
                    enrichEmployee.setModifiedDate(new Date());
					return enrichEmployee;
				}/* ValueJoiner */
		);
	}
}
