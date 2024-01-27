package com.sagility.service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.sagility.request.Passenger;
import com.sagility.response.Ticket;

//Integration Logic to communicate one Data to another Data
@Service
public class TicketBookingClientImpl implements TicketBookingClientService {
	private final String POST_TICKET_URL = "http://16.171.38.36:8080/ticketplatform/bookticket";
	private final String GET_TICKET_URL = "http://16.171.38.36:8080//ticketplatform/pnrstatus/{pnr}";

	@Override
	public Ticket bookTicket(Passenger passenger) {
		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<Ticket> responseEntity = restTemplate.postForEntity(POST_TICKET_URL, passenger, Ticket.class);
		Ticket ticket = responseEntity.getBody();
		return ticket;
	}

	@Override
	public Ticket getTicketStatus(String pnrNumber) {
		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<Ticket> responseEntity = restTemplate.getForEntity(GET_TICKET_URL, Ticket.class, pnrNumber);
		Ticket ticket = responseEntity.getBody();
		return ticket;
	}

}
