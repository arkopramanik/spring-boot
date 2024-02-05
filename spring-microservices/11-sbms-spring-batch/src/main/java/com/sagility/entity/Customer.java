package com.sagility.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="CUSTOMER_INFO")
public class Customer {
	@Id
	@Column(name="customer_id")
	private String index;
	private String customerId;
	private String firstName;
	private String lastName;
	private String company;
	private String city;
	private String country;
	private String phone1;
	private String phone2;
	private String email;
	private String subscriptionDate;
	private String website;

}
