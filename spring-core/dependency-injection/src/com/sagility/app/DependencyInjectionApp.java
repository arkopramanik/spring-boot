package com.sagility.app;

import com.sagility.model.HTMLMessageConverter;
import com.sagility.model.MessageWriter;

public class DependencyInjectionApp {
	public static void main(String[] args) {
		MessageWriter messageWriter = new MessageWriter();
		//messageWriter.setMessageConverter(new PDFMessageConverter());
		messageWriter.setMessageConverter(new HTMLMessageConverter());
		System.out.println(messageWriter.writeMessage());

	}
}
