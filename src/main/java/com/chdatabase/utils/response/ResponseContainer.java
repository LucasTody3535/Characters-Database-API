package com.chdatabase.utils.response;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ResponseContainer {

	private final Object message;
	private final Integer httpStatus;
	
	public ResponseContainer(Object message, Integer httpStatus) {
		this.message = message;
		this.httpStatus = httpStatus;
	}
	
}
