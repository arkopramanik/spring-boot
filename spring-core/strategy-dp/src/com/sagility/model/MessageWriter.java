package com.sagility.model;

public class MessageWriter {
	IMessageConverter messageConverter;
	public String writeMessage() {
		//messageConverter= new HTMLMessageConverter();
		messageConverter= new PDFMessageConverter();
		return "Writer for "+messageConverter.convert();
	}

}
