package com.practice.methodref;

public class InstanceMethodRef {
	public void m1() {
		for (int i = 0; i <= 5; i++) {
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		InstanceMethodRef im = new InstanceMethodRef();
		Runnable runnable = im::m1;
		Thread thread = new Thread(runnable);
		thread.start();

	}

}
