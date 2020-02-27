package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ChatBookController {
	@Value("${server.port}")
	private String appPort;
     
	@RequestMapping("/getchatBook")
	public String getChatBookMsg() {
		return "chatbook Message working on port  "+appPort;
	}
	
	@RequestMapping("/admin")
	public String adminChatBook() {
		return "Admin Role";
	}
	
	@RequestMapping("/user")
	public String userChatBook() {
		return "User role";
	}
	
	
}
