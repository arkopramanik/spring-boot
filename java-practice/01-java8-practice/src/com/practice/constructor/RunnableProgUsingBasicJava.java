package com.practice.constructor;

class RunnableInterfaceImpl implements Runnable {

	@Override
	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println(i);
		}

	}

}

public class RunnableProgUsingBasicJava {
	public static void main(String[] args) {
		Runnable runnable = new RunnableInterfaceImpl();
		Thread thread = new Thread(runnable);
		thread.start();

	}

}
