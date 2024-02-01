package com.sagility.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import com.sagility.request.Passenger;
import com.sagility.response.Ticket;

@Service
public class TicketBookingServiceImpl implements TicketBookingService {
	Map<String, Ticket> ticketMap = new HashMap<>();
	Long pnr;

	@Override
	public Ticket bookTicket(Passenger passenger) {
		Ticket ticket = new Ticket();
		BeanUtils.copyProperties(passenger, ticket);
		ticket.setCost("100");
		ticket.setStatus("CONFIRMED");
		pnr = (long) Math.floor(Math.random() * 9_000_000L) + 1_000_000_000L;
		ticket.setPnrNumber(pnr.toString());
		ticketMap.put(ticket.getPnrNumber(), ticket);
		// TODO Auto-generated method stub
		return ticket;
	}

	@Override
	public Ticket ticketStatus(String pnrNumber) {
		// TODO Auto-generated method stub
		if (ticketMap.containsKey(pnrNumber)) {
			return ticketMap.get(pnrNumber);
		}
		return null;
	}

}
