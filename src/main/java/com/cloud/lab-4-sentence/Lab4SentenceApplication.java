package com.cloud.lab4verb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class Lab4SentenceApplication {

    public static void main(String[] args) {
        SpringApplication.run(com.cloud.lab4verb.Lab4SentenceApplication.class, args);
    }

}
