package com.concordia.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	
	@RequestMapping("/home")
	public String helloWorld() {
		return "Hello World";
	}
}
