package com.chdatabase.utils.response;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ContainerForSuccessOperations {

	private String responseMessage;
	private Object objectOfResponse;
	
	public ContainerForSuccessOperations(String responseMessage, Object objectOfResponse) {
		super();
		this.responseMessage = responseMessage;
		this.objectOfResponse = objectOfResponse;
	}
}
