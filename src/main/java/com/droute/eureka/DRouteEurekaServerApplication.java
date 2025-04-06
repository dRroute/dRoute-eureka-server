package com.droute.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class DRouteEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(DRouteEurekaServerApplication.class, args);
	}

}
