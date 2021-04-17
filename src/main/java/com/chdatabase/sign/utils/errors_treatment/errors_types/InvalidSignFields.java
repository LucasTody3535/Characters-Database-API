package com.chdatabase.sign.utils.errors_treatment.errors_types;

import com.chdatabase.utils.errors_treatment.ExceptionsGlobalDefaultMethods;

public class InvalidSignFields extends ExceptionsGlobalDefaultMethods {

	private static final long serialVersionUID = -5132164709309313479L;

	public InvalidSignFields(String message, String cause) {
		super(message, cause);
	}
	
}
