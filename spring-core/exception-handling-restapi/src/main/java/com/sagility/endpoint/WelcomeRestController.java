package com.sagility.endpoint;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeRestController {
	
	@GetMapping("/welcome")
	public String welcome() {
		String message = "Welcome to REST Controller";
		int i = 10/0;
		return message;
	}

}
