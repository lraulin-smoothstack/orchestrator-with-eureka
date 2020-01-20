package com.smoothstack.december.orchestrationservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class OrchestrationServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(OrchestrationServiceApplication.class, args);
	}
	
	   @Bean
	    public RestTemplate getRestTemplate(){
	        return new RestTemplate();
	    }

}
