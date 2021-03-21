package com.chdatabase.utils.validators;

import org.springframework.stereotype.Component;

@Component
public class StringDataValidator {

	public boolean validateStringLength(String str) {
		return str.length() <= 31 && str.length() > 0;
	}
	
	public boolean matchesSpecialChars(String wordGiven) {
		return wordGiven.matches("g");
	}
}
