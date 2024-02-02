package com.practice.lambda;

interface FunctionalInterfaceExample{
	public void methodExample();
}

class FunctionalInterfaceExampleImpl implements FunctionalInterfaceExample{

	@Override
	public void methodExample() {
		System.out.println("m1 method is calling");
		
	}
	
}


public class ProgramWithoutLambdaExpression {

	public static void main(String[] args) {
		FunctionalInterfaceExample funcInterEx = new FunctionalInterfaceExampleImpl();
		funcInterEx.methodExample();

	}

}
