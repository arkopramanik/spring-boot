package com.sagility.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Ticket {
	private String pnrNumber;
	private String name;
	private String cost;
	private String from;
	private String to;
	private String doj;
	private String status;

}
