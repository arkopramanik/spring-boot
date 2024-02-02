package com.practice.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamFilterExample1 {

	public static void main(String[] args) {
		// filter Method
		List<Integer> intList = Arrays.asList(12, 2, 23, 24, 45);
		intList.stream().filter(i -> i > 20).forEach(i -> System.out.println(i));

		Stream.of(12, 2, 23, 24, 45).filter(i -> i > 20).forEach(i -> System.out.println(i));

		Arrays.asList("Arko", "Hridaan", "Hiren", "Diksha").stream().filter(i -> i.startsWith("H"))
				.forEach(i -> System.out.println(i));

	}

}
