package com.chdatabase.utils.errors.types;

public class EmptyResultList extends RuntimeException {

	private static final long serialVersionUID = 1388202177315311733L;
	
	public EmptyResultList(String message, String cause) {
		super(message, new Throwable(cause));
	}

}
