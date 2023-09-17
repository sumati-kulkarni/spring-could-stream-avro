package com.citi;

import com.citi.schema.EMPLOYEE;
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
public class ProduceEmployee {

    private final Random random = new Random();

    @Autowired
    private StreamBridge streamBridge;

    public static void main(String[] args) {
        SpringApplication.run(ProduceEmployee.class, args);
    }

    @RequestMapping(value = "/sendEmployees", method = RequestMethod.POST)
    public String supplier() {

        EMPLOYEE[] employee = new EMPLOYEE[5];
        employee[0] = new EMPLOYEE("e1", 1L, "d1", "aaa", LocalDateTime.now().atZone(ZoneId.systemDefault()).toInstant(), LocalDateTime.now().atZone(ZoneId.systemDefault()).toInstant());
		employee[1] = new EMPLOYEE("e2", 2L, "d2", "bbb", LocalDateTime.now().atZone(ZoneId.systemDefault()).toInstant(), LocalDateTime.now().atZone(ZoneId.systemDefault()).toInstant());
		employee[2] = new EMPLOYEE("e3", 3L, "d3", "ccc", LocalDateTime.now().atZone(ZoneId.systemDefault()).toInstant(), LocalDateTime.now().atZone(ZoneId.systemDefault()).toInstant());
		employee[3] = new EMPLOYEE("e4", 4L, "d4", "ddd", LocalDateTime.now().atZone(ZoneId.systemDefault()).toInstant(), LocalDateTime.now().atZone(ZoneId.systemDefault()).toInstant());
		employee[4] = new EMPLOYEE("e5", 5L, "d2", "eee", LocalDateTime.now().atZone(ZoneId.systemDefault()).toInstant(), LocalDateTime.now().atZone(ZoneId.systemDefault()).toInstant());
        for(int i=0; i<5; i++) {
            EMPLOYEE e = employee[i];

            Message<EMPLOYEE> message = MessageBuilder.withPayload(e)
                    .setHeader("kafka_messageKey", e.getID())
                    .build();

            streamBridge.send("supplier-out-0", message);
        }

        return "ok, have fun with v1 payload!";
    }

}
