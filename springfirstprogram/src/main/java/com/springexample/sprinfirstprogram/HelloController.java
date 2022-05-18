package com.springexample.sprinfirstprogram;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@RequestMapping("/")
	public String slash() {
		return "Welcome to spring";
	}
	@GetMapping("/hello")
	public String sayHello() {
		return "First Spring Application";
	}
	@PostMapping("/User")
	public String postMethod(String str) {
		return "welcome"+str;
	}
		
		
		
	}





