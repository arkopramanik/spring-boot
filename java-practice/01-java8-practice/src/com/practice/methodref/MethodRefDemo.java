package com.practice.methodref;

@FunctionalInterface
interface MyInterface {
	public void m1();
}

public class MethodRefDemo {
	public static void m2() {
		System.out.println("the m2 method is calling");
	}
	public static void main(String[] args) {
		MyInterface mi = MethodRefDemo::m2;
		mi.m1();
		
		
		
	}

}
