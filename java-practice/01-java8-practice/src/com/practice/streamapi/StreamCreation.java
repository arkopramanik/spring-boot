package com.practice.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

//Stream Creation
public class StreamCreation {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		//approach-1
		List<String> list = Arrays.asList("Arko","Diksha","Hridaan");
		Stream<String> stream = list.stream();
		
		//approach-2
		Stream<String> stream2 = Stream.of("Arko","Diksha","Hridaan");
	}

}
