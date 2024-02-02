package com.practice.programs;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionSortingUsingLambda {
	public static void main(String[] args) {
		List<Integer> asList = Arrays.asList(3, 4, 6, 7, 8, 1);
		// Collections.sort(asList);

		System.out.println("Before Sorting ");
		asList.forEach(i -> System.out.println(i));
		Collections.sort(asList, (o1, o2) -> o1 > o2 ? -1 : o2 < o1 ? 1 : 0);
		// Collections.sort(asList, (o1, o2) -> o1.compareTo(o2));
		System.out.println("After Sorting ");
		asList.forEach(i -> System.out.println(i));

	}

}
