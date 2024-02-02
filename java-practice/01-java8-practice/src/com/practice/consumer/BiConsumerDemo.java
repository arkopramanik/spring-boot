package com.practice.consumer;

import java.util.function.BiConsumer;

public class BiConsumerDemo {
	public static void main(String[] args) {
		BiConsumer<String, String> biConsumer = (i, j) -> System.out.println(i + " and " + j);
		biConsumer.accept("Arko", "Diksha");
	}

}
