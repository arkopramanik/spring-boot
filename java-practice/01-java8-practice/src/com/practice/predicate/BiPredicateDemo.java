package com.practice.predicate;

import java.util.function.BiPredicate;

public class BiPredicateDemo {
	public static void main(String[] args) {
		BiPredicate<Integer, Integer> biPredicate = (i, j) -> i + j >= 10;
		System.out.println(biPredicate.test(1, 2));
	}

}
