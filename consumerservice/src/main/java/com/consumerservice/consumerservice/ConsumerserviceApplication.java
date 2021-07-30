package com.consumerservice.consumerservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
//@EnableEurekaClient
@EnableSwagger2
public class ConsumerserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConsumerserviceApplication.class, args);
	}
	/*
	 * @Bean
	 * 
	 * @LoadBalanced public RestTemplate restTemplate() { return new RestTemplate();
	 * }
	 */
}
