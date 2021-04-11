package com.chdatabase.utils.errors_treatment.errors_types;

import com.chdatabase.utils.errors_treatment.ExceptionsGlobalDefaultMethods;

public class NullPointerExceptionCustomized extends ExceptionsGlobalDefaultMethods {
	
	private static final long serialVersionUID = -2662478308148102874L;

	public NullPointerExceptionCustomized(String message) {
		super(message);
	}
	
}
