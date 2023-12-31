package com.winitech.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.reactive.config.EnableWebFlux;

@SpringBootApplication
public class GateWayApplication
{
    public static void main(String[] args)
    {
        SpringApplication.run(GateWayApplication.class, args);
    }
}
