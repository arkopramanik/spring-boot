package com.sagility.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.sagility.request.Passenger;
import com.sagility.response.Ticket;
import com.sagility.service.TicketBookingClientService;

@Controller
public class TicketBookingClientController {

	@Autowired
	private TicketBookingClientService clientService;

	@GetMapping("/")
	public String loadForm(Model model) {
		model.addAttribute("passenger", new Passenger());
		return "index";
	}

	@PostMapping("/book-ticket")
	public String bookTicket(@ModelAttribute Passenger passenger, Model model) {
		System.out.println(passenger);
		// TODO : Service Layer
		Ticket bookTicket = clientService.bookTicket(passenger);
		model.addAttribute("msg", "Your ticket book with id :" + bookTicket.getPnrNumber());
		return "index";
	}
	
	@GetMapping("/ticket")
	public String getTicketForm(Model model) {
		model.addAttribute("ticket", new Ticket());
		return "ticket-form";
	}
	
	@GetMapping("/get-ticket")
	public String getTicketStatus (@RequestParam String pnrNumber,Model model) {
		Ticket ticket = clientService.getTicketStatus(pnrNumber);
		model.addAttribute("ticket",ticket);
		return "ticket-form";
		
	}

}
