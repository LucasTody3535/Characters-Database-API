package com.chdatabase.utils.data_structures_for_messages;

import com.chdatabase.models.CharacterData;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MessageContainerWhenCharactersIsSaved {

	private CharacterData character;
	private Integer httpCode;
	private String infoOfRequest;
	
	public MessageContainerWhenCharactersIsSaved(CharacterData character, Integer httpCode, String infoOfRequest) {
		this.character = character;
		this.httpCode = httpCode;
		this.infoOfRequest = infoOfRequest;
	}
	
}
