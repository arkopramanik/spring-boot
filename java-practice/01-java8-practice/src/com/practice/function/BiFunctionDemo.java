package com.practice.function;

import java.util.function.BiFunction;

public class BiFunctionDemo {
	public static void main(String[] args) {
		BiFunction<String, String, Integer> biFunction = (i,j) -> i.concat(j).length();
		System.out.println(biFunction.apply("Arko", "Diksha"));
	}

}
