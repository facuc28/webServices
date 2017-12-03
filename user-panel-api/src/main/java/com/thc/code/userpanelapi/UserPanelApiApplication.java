package com.thc.code.userpanelapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
public class UserPanelApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserPanelApiApplication.class, args);
	}

	@RequestMapping("/")
	public String gethome() {
		return "index";
	}
}
