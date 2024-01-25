package com.sagility.request;

import javax.xml.bind.annotation.XmlRootElement;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@XmlRootElement
public class Passenger {
	private String name;
	private String to;
	private String from;
	private String doj;
	private String trainNumber;
	

}
