package com.sagility.endpoint;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetRestController {
	
	@GetMapping("/greet")
	public String getMessage() {
		return "Welcome to greet app";
	}

}
