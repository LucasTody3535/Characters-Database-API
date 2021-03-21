package com.chdatabase.utils.data_structures_for_messages;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PrincipalMessageContainer {

	private Object message;
	
	public PrincipalMessageContainer(Object message) {
		this.message = message;
	}
	
}
