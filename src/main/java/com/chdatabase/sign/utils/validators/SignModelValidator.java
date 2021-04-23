package com.chdatabase.sign.utils.validators;

import org.springframework.stereotype.Component;
import com.chdatabase.utils.validators.BasicValidators;

@Component
public class SignModelValidator extends BasicValidators {
	
	public boolean validateIsNumberIsEqualsToOneHundred(Long number) {
		return number.intValue() == 100;
	}
	
	public boolean validateIsNumberEqualsOne(Long number) {
		return number.intValue() == 1;
	}
	
}
