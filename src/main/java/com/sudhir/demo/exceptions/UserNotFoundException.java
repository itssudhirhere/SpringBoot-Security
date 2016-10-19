package com.sudhir.demo.exceptions;

public class UserNotFoundException extends Exception {

	private static final long serialVersionUID = -2030903287137269739L;

	public UserNotFoundException() {
		super();
	}

	public UserNotFoundException(String message) {
		super(message);
	}
}
