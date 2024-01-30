package com.sagility.endpoints;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoRestController {
	
	
	@GetMapping("/welcome")
	public String welcomeMessage() {
		return "Welcome to REST Controller";
	}

}
