package com.sagility.service;

import com.sagility.request.Passenger;
import com.sagility.response.Ticket;

public interface TicketBookingClientService {
	public Ticket bookTicket(Passenger passenger);
	public Ticket getTicketStatus(String pnrNumber);

}
