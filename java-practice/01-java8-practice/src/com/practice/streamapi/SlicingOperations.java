package com.practice.streamapi;

import java.util.Arrays;
import java.util.List;

//slicing operation in stream
public class SlicingOperations {
	public static void main(String[] args) {
		List<String> family = Arrays.asList("Arko", "Diksha", "Hridaan", "Rekha", "Hiren","Arko");
		family.stream().limit(3).forEach(System.out::println);
		System.out.println("--------------");
		family.stream().skip(3).forEach(System.out::println);
		System.out.println("---------------");
		family.stream().distinct().forEach(System.out::println);
	}

}
