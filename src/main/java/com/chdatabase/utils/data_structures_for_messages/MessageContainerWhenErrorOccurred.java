package com.chdatabase.utils.data_structures_for_messages;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MessageContainerWhenErrorOccurred {

	private String description;
	private String cause;
	private Integer httpCode;
	
	public MessageContainerWhenErrorOccurred(String description, String cause, Integer httpCode) {
		this.description = description;
		this.cause = cause;
		this.httpCode = httpCode;
	}
	
}
