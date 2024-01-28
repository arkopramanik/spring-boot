package com.sagility.service;

import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import com.sagility.request.Passenger;
import com.sagility.response.Ticket;

//Integration Logic to communicate one Data to another Data
@Service
public class TicketBookingClientImpl implements TicketBookingClientService {
	private final String POST_TICKET_URL = "http://16.171.38.36:8080/ticketplatform/bookticket";
	private final String GET_TICKET_URL = "http://16.171.38.36:8080//ticketplatform/pnrstatus/{pnr}";

	@Override
	public Ticket bookTicket(Passenger passenger) {
		WebClient webClient = WebClient.create();
		Ticket ticket = webClient.post()
		.uri(POST_TICKET_URL)
		.bodyValue(passenger)
		.retrieve()
		.bodyToMono(Ticket.class)
		.block();	// synchronous call
		
		return ticket;
	}

	@Override
	public Ticket getTicketStatus(String pnrNumber) {
		WebClient webClient = WebClient.create();
		webClient.get()
				.uri(GET_TICKET_URL, pnrNumber)
				.retrieve()
				.bodyToMono(Ticket.class)
				.block();

		return null;
	}

}
