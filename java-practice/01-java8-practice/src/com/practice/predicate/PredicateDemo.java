package com.practice.predicate;

import java.util.function.Predicate;

public class PredicateDemo {

	public static void main(String[] args) {
		String[] names = { "Arko", "Hirdaan", "Diksha", "Amit", "Abhishekh", "Deoda" };

		Predicate<String> predicate = name -> name.startsWith("A");
		for (String name : names) {
			if (predicate.test(name)) {
				System.out.println(name);
			}

		}

	}

}
