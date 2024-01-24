package com.sagility.model;

public class MessageWriter {
	IMessageConverter messageConverter;;

	public String writeMessage() {
		//messageConverter = MessageConverterFactory.converterFactory("pdf");
		messageConverter = MessageConverterFactory.converterFactory("html");
		return "Writer for "+messageConverter.convert();
		
	}

}
