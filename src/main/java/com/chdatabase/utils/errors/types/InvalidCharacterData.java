package com.chdatabase.utils.errors.types;

public class InvalidCharacterData extends RuntimeException {

	private static final long serialVersionUID = 2648928633599694491L;
	
	public InvalidCharacterData(String message, String cause) {
		super(message, new Throwable(cause));
	}

}
