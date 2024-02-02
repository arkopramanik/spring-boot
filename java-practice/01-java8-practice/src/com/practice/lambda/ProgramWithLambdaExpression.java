package com.practice.lambda;

@FunctionalInterface
interface FunctionalInterfaceLambdaExample {
	public void methodExample();
}

public class ProgramWithLambdaExpression {

	public static void main(String[] args) {
		FunctionalInterfaceLambdaExample funcInterLambdaEx = () -> System.out.println("m1 method lambda exprssion is calling");
		funcInterLambdaEx.methodExample();

	}

}
