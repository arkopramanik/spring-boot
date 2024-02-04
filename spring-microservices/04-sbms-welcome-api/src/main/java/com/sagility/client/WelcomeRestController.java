package com.sagility.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeRestController {
	
	@Autowired
	private GreetFeignClient greetFeignClient;

	@GetMapping("/welcome")
	public String getWelcomeMsg() {

		//RestTemplate restTemplate = new RestTemplate();
		//ResponseEntity<String> responseEntity = restTemplate.getForEntity("http://localhost:8081/greet", String.class);
		//String greetResponse = responseEntity.getBody();
		
		String greetResponse = greetFeignClient.invokeGreetAPI();
		

		return greetResponse + " Welcome to Pramanik House";
	}

}
