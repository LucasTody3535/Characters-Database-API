package com.chdatabase.utils.errors_treatment;

import lombok.Getter;

@Getter
public class ErrorMessageContainer {

	private String message;
	private StackTraceElement[] stackTrace;

	public ErrorMessageContainer(String message, StackTraceElement[] stackTrace) {
		this.message = message;
		this.stackTrace = stackTrace;
	}
	
}
