package com.citi;

import com.citi.schema.DEPARTMENT;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.schema.registry.client.EnableSchemaRegistryClient;
import org.springframework.cloud.stream.function.StreamBridge;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Random;

@SpringBootApplication(proxyBeanMethods = false)
@EnableSchemaRegistryClient
@RestController
public class ProduceDepartment {

    private final Random random = new Random();

    @Autowired
    private StreamBridge streamBridge;

    public static void main(String[] args) {
        SpringApplication.run(ProduceDepartment.class, args);
    }

    @RequestMapping(value = "/sendDepartments", method = RequestMethod.POST)
    public String supplier() {

        DEPARTMENT[] departments = new DEPARTMENT[5];
        departments[0] = new DEPARTMENT("d1", 1L, "DeptA", LocalDateTime.now().atZone(ZoneId.systemDefault()).toInstant(), LocalDateTime.now().atZone(ZoneId.systemDefault()).toInstant());
        departments[1] = new DEPARTMENT("d2", 2L, "DeptB", LocalDateTime.now().atZone(ZoneId.systemDefault()).toInstant(), LocalDateTime.now().atZone(ZoneId.systemDefault()).toInstant());
        departments[2] = new DEPARTMENT("d3", 3L, "DeptC", LocalDateTime.now().atZone(ZoneId.systemDefault()).toInstant(), LocalDateTime.now().atZone(ZoneId.systemDefault()).toInstant());
        departments[3] = new DEPARTMENT("d4", 4L, "DeptD", LocalDateTime.now().atZone(ZoneId.systemDefault()).toInstant(), LocalDateTime.now().atZone(ZoneId.systemDefault()).toInstant());

        for (int i = 0; i < 5; i++) {
            DEPARTMENT d = departments[i];

            Message<DEPARTMENT> message = MessageBuilder.withPayload(d)
                    .setHeader("kafka_messageKey", d.getID())
                    .build();

            streamBridge.send("supplier-out-0", message);
        }

        return "ok, have fun with v1 payload!";
    }

}
