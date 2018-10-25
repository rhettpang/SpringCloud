package com.pk.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author Created by pangkunkun on 2018/10/25.
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaApplication  {

    public static void main(String[] args) {
        SpringApplication.run(EurekaApplication.class,args);
    }

}
