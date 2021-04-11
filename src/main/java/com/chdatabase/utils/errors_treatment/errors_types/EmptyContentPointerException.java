package com.chdatabase.utils.errors_treatment.errors_types;

import com.chdatabase.utils.errors_treatment.ExceptionsGlobalDefaultMethods;
import lombok.Getter;

@Getter
public class EmptyContentPointerException extends ExceptionsGlobalDefaultMethods {
	
	private static final long serialVersionUID = -3855972781643732611L;

	public EmptyContentPointerException(String error) {
		super(error);
	}
	
}
