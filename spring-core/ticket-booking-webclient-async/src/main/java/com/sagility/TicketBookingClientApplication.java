package com.sagility;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.reactive.function.client.WebClient;

@SpringBootApplication
public class TicketBookingClientApplication {
	public static void main(String[] args) {
		String GET_TICKET_URL = "http://16.171.38.36:8080//ticketplatform/pnrstatus/{pnr}";
		SpringApplication.run(TicketBookingClientApplication.class, args);
		WebClient webClient = WebClient.create();
		System.out.println("request sending start");
		
		webClient.get()
		.uri(GET_TICKET_URL, 6)
		.retrieve()
		.bodyToMono(String.class)
		.subscribe(TicketBookingClientApplication::handleResponse);
		System.out.println("request sending end");
		
	}
	
	public static void handleResponse(String response) {
		System.out.println(response);
	}

}
