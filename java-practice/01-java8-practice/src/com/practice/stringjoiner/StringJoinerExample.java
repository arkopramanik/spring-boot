package com.practice.stringjoiner;

import java.util.StringJoiner;

public class StringJoinerExample {
	public static void main(String[] args) {
		StringJoiner sj1 = new StringJoiner("-");
		sj1.add("Arko");
		sj1.add("Pramanik");
		System.out.println(sj1);
		
		StringJoiner sj2 = new StringJoiner("-", "(", ")");
		sj2.add("Arko");
		sj2.add("Pramanik");
		System.out.println(sj2);
		
		
	}

}
