package com.sagility.model;

public class MessageConverterFactory {

	public static IMessageConverter converterFactory(String type) {
		IMessageConverter messageConverter = null;
		if (type.equals("pdf")) {
			messageConverter = new PDFMessageConverter();
		}
		if (type.equals("html")) {
			messageConverter = new HTMLMessageConverter();
		}
		return messageConverter;
	}

}
