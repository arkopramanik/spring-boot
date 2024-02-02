package com.practice.programs;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
class NumberComparator implements Comparator<Integer> {

	@Override
	public int compare(Integer o1, Integer o2) {
		if (o1 > 02)
			return -1;
		else if (o1 < o2)
			return 1;
		return 0;
	}

}

public class CollectionSorting {

	public static void main(String[] args) {
		List<Integer> asList = Arrays.asList(3, 4, 6, 7, 8, 1);
		// Collections.sort(asList);
		System.out.println("Before Sorting " + asList);
		Collections.sort(asList, new NumberComparator());
		System.out.println("After Sorting "+asList);
	}

}


