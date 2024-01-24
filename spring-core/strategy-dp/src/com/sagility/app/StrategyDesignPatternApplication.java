package com.sagility.app;

import com.sagility.model.MessageWriter;

public class StrategyDesignPatternApplication {

	public static void main(String[] args) {
		
		MessageWriter messageWriter = new MessageWriter();
		System.out.println(messageWriter.writeMessage());

	}

}
