package com.sagility.endpoint;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sagility.request.Passenger;
import com.sagility.response.Ticket;
import com.sagility.service.TicketBookingService;

@RestController
@RequestMapping("/phonebook")
public class PhoneBookRestController {
	
	@Autowired
	TicketBookingService ticketBookingService;

	@PostMapping(value = "/addContact", 
			consumes = { "application/xml", "application/json" }, 
			produces = { "application/xml", "application/json" })
	public ResponseEntity<Ticket> bookTicket(@RequestBody Passenger passenger) {
		Ticket bookTicket = null;
		bookTicket = ticketBookingService.bookTicket(passenger);
		return new ResponseEntity<Ticket>(bookTicket, HttpStatus.CREATED);

	}
	
	@GetMapping(value="/pnrstatus/{pnr}", produces = {"application/xml","application/json"})
	public Ticket ticketStatus(@PathVariable(value="pnr") String pnrNumber) {
		return ticketBookingService.ticketStatus(pnrNumber);
		
	}

}