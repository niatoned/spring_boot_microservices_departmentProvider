package com.emonics;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SpringBootMsDepartmentProviderApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootMsDepartmentProviderApplication.class, args);
	}

}
