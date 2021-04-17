package com.chdatabase.sign.utils.errors_treatment.errors_types;

import com.chdatabase.utils.errors_treatment.ExceptionsGlobalDefaultMethods;

public class SaveInDatabaseException extends ExceptionsGlobalDefaultMethods {

	private static final long serialVersionUID = 8220887089033339479L;

	public SaveInDatabaseException(String message) {
		super(message);
	}
	
}
