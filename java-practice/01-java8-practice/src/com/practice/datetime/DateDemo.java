package com.practice.datetime;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.util.Date;

public class DateDemo {
	public static void main(String[] args) throws ParseException {
		Date date = new Date();

		// converting date to string
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
		String format = simpleDateFormat.format(date);
		System.out.println(format);

		// converting string to date
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd");
		Date dateformatted = sdf2.parse(format);
		System.out.println(dateformatted);

		LocalDate now = LocalDate.now();
		System.out.println(now);

		LocalDate plusDays = now.plusDays(3);
		System.out.println(plusDays);

		boolean leapYear = LocalDate.parse("2021-12-22").isLeapYear();
		System.out.println("Leap Year: " + leapYear);

		boolean before = LocalDate.parse("2020-12-22").isBefore(LocalDate.parse("2020-11-22"));
		System.out.println("Before Date : " + before);

		Period ofDays = Period.ofDays(5);
		System.out.println(ofDays.getDays());

		Period between = Period.between(LocalDate.parse("1990-06-12"), LocalDate.now());
		System.out.println(between.getYears() + " " + between.getMonths() + " " + between.getDays());
		
		
		Duration duration = Duration.between(LocalTime.parse("11:00"), LocalTime.now());
		System.out.println(duration);

	}

}