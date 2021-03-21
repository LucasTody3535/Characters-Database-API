package com.chdatabase.utils.errors.types;

import org.w3c.dom.ranges.RangeException;

public class LimitSurpassedForStringLength extends RangeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public LimitSurpassedForStringLength(short code, String message) {
		super(code, message);
	}
	
}
