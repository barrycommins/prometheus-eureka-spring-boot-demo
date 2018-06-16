package com.barrycommins.prometheuseurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class PrometheusEurekaServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(PrometheusEurekaServerApplication.class, args);
    }
}
