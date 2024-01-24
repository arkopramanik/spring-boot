package com.sagility.model;

public class MessageWriter {
	IMessageConverter messageConverter;

	public void setMessageConverter(IMessageConverter messageConverter) {
		this.messageConverter = messageConverter;
	}

	public String writeMessage() {
		return "Writer for " + messageConverter.convert();
	}

}
