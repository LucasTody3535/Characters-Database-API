package com.chdatabase.game.errors_treatment.errors_type;

import com.chdatabase.utils.errors_treatment.ExceptionsGlobalDefaultMethods;

public class InvalidPlayerData extends ExceptionsGlobalDefaultMethods {

	private static final long serialVersionUID = -6036780672089900388L;

	public InvalidPlayerData(String message, String cause) {
		super(message, cause);
	}
	
}
