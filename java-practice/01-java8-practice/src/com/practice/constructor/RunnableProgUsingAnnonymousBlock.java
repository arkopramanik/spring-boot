package com.practice.constructor;

public class RunnableProgUsingAnnonymousBlock {
	public static void main(String[] args) {
		Runnable runnable = new Runnable() {

			@Override
			public void run() {
				for (int i = 1; i <= 5; i++) {
					System.out.println(i);
				}

			}
		};
		
		Thread thread = new Thread(runnable);
		thread.start();
	}

}
