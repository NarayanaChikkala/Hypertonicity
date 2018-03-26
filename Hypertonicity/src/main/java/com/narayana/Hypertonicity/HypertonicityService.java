package com.narayana.Hypertonicity;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


@SpringBootApplication
@EnableDiscoveryClient
public class HypertonicityService {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpringApplication.run(HypertonicityService.class, args);

	}

}
