package com.practice.streamapi;

import java.util.stream.Stream;

public class ParallelStreamAPIExamples {
	public static void main(String[] args) {
		System.out.println("===========Serial Stream============");
		Stream.of(1, 2, 3, 4).forEach(n -> System.out.println(n + "::" + Thread.currentThread()));
		
		System.out.println("=======Parallel Stream============");
		Stream.of(1,2,3,4).parallel().forEach(n -> System.out.println(n + "::" + Thread.currentThread()));
	}

}
