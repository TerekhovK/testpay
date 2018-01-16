package com.packt.example.clientcredentialsserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableScheduling
@EnableAsync
public class ClientCredentialsServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ClientCredentialsServerApplication.class, args);
    }

    @Bean
    public RestTemplate get(){
        return new RestTemplate();
    }
}
