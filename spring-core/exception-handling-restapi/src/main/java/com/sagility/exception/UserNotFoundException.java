package com.sagility.exception;

public class UserNotFoundException extends RuntimeException{
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -6778484447316251745L;

	public UserNotFoundException() {
		// TODO Auto-generated constructor stub
	}
	
	public UserNotFoundException(String msg) {
		super(msg);
	}

}
