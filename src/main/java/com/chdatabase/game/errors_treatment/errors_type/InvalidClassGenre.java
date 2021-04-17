package com.chdatabase.game.errors_treatment.errors_type;

import com.chdatabase.utils.errors_treatment.ExceptionsGlobalDefaultMethods;

public class InvalidClassGenre
extends ExceptionsGlobalDefaultMethods {

	private static final long serialVersionUID = 781240765594373486L;

	public InvalidClassGenre(String message, String cause) {
		super(message, cause);
	}
	
}
