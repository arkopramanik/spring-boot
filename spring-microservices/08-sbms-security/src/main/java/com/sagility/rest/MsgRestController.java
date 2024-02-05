package com.sagility.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MsgRestController {
	
	@GetMapping("/hi")
	public String sayHi() {
		return "Say Hi";
	}
	
	@GetMapping("/contact")
	public String contact() {
		return "9579871554";
	}

}
