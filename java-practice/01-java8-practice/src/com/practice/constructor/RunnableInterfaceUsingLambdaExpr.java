package com.practice.constructor;

public class RunnableInterfaceUsingLambdaExpr {
	public static void main(String[] args) {

		Runnable runnable = () -> {
			for (int i = 1; i <= 5; i++) {
				System.out.println(i);
			}
		};
		Thread thread = new Thread(runnable);
		thread.start();
				

	}

}
