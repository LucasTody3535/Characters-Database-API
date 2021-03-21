package com.chdatabase.utils.errors.types;

public class InvalidString extends RuntimeException {
	
	private static final long serialVersionUID = 1757636524854711003L;

	public InvalidString(String message, String cause) {
		super(message, new Throwable(cause));
	}
	
}
