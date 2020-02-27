package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

@EnableEurekaClient
@SpringBootApplication
public class ChatBookApplication {

	public static void main(String[] args) {
/*		
		String port=args[0];
		System.out.println("port=================="+port);*/
		System.getProperties().put("server.port",9003);
		/*System.getProperties().put("spring.security.user.name","raj");
		System.getProperties().put("spring.security.user.password","12345");*/
		System.getProperties().put("spring.application.name","chatbook");
		System.getProperties().put("eureka.client.register-with-eureka","true");
		System.getProperties().put("eureka.client.fetch-registry","true");
		System.getProperties().put("eureka.client.serviceUrl.defaultZone","http://localhost:8585/eureka/");
	
		SpringApplication.run(ChatBookApplication.class, args);
	}
}
