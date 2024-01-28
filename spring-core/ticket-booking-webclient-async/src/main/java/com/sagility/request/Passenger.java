package com.sagility.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Passenger {
	private String name;
	private String to;
	private String from;
	private String doj;
	private String trainNumber;
	

}
