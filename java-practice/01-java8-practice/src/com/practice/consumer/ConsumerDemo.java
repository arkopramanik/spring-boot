package com.practice.consumer;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemo {
	public static void main(String[] args) {
		Consumer<String> consumer = name -> System.out.println(name + " ,Good Evening");
		consumer.accept("Arko");

		List<Integer> numbers = Arrays.asList(10, 20, 30, 40);
		numbers.forEach(i -> System.out.println(i));
	}
}
