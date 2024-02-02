package com.practice.streamapi;

import java.util.Arrays;
import java.util.List;

public class StreamFlatMapExample {
	public static void main(String[] args) {
		List<String> backend = Arrays.asList("Java", "Spring Boot");
		List<String> ui = Arrays.asList("Angular", "React");
		List<List<String>> course = Arrays.asList(backend, ui);

		course.stream().forEach(i -> System.out.println(i));

		course.stream().flatMap(c -> c.stream()).forEach(c -> System.out.println(c));

	}

}
