package com.stackroute.userservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class MuzixApplicationUser {

	public static void main(String[] args) {
		SpringApplication.run(MuzixApplicationUser.class, args);
	}

}

