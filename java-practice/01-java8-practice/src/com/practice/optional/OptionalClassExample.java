package com.practice.optional;

import java.util.Optional;
import java.util.Scanner;

public class OptionalClassExample {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the input msg");
		int nextInt = sc.nextInt();
		User user = new User();
		Optional<String> username = user.getUserName(nextInt);

		if (username.isPresent()) {
			String name = username.get();
			System.out.println(name.toUpperCase());
		}

	}

}
