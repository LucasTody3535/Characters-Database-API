package com.chdatabase.utils.validators;

public class BasicValidators {

	public boolean validateIsNotNull(String fieldToValidate) {
		return fieldToValidate != null;
	}
	
	public boolean validateIsNotNull(Object fieldToValidate) {
		return fieldToValidate != null;
	}
	
	public boolean validateIsNotEmpty(String fieldToValidate) {
		return !fieldToValidate.isBlank();
	}
	
	public boolean validateIfNumberIsMoreThanZero (Long number) {
		return number.intValue() > 0;
	}
	
}
