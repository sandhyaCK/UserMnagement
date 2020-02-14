package com.bridgeLabz.loginRegisrtation.exception;

public class UserException {

	private static final long serialVersionUID = 1L;
	private String message;

	public UserException(String message) {
	
		this.message = message;
	}

	public String getMessage() {
		return message;
	}
	
}
