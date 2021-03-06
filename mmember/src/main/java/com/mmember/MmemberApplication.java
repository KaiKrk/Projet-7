package com.mmember;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class MmemberApplication {

	public static void main(String[] args) {
		SpringApplication.run(MmemberApplication.class, args);
	}

}
