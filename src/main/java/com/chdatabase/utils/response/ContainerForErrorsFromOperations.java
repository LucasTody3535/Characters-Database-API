package com.chdatabase.utils.response;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ContainerForErrorsFromOperations {

	private String errorMessage;
	private String cause;
	
	public ContainerForErrorsFromOperations(String errorMessage, String cause) {
		super();
		this.errorMessage = errorMessage;
		this.cause = cause;
	}
	
}
