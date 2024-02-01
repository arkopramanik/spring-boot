package com.sagility.service;

import com.sagility.request.Passenger;
import com.sagility.response.Ticket;

public interface TicketBookingService {
	public Ticket bookTicket(Passenger passenger);
	public Ticket ticketStatus(String pnrNumber);

}
