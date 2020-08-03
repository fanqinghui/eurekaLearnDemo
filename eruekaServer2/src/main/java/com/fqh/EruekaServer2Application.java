package com.fqh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
@EnableEurekaServer
@SpringBootApplication
public class EruekaServer2Application {

	public static void main(String[] args) {
		SpringApplication.run(EruekaServer2Application.class, args);
	}

}
