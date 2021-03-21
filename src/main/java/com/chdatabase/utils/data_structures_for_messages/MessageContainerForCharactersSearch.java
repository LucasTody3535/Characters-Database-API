package com.chdatabase.utils.data_structures_for_messages;

import com.chdatabase.models.CharacterData;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MessageContainerForCharactersSearch {

	private CharacterData[] list;
	private Integer httpCode;
	private String wordGiven;
	private String infoOfRequest;
	
	public MessageContainerForCharactersSearch(CharacterData[] list, Integer httpCode, String wordGiven, String infoOfRequest) {
		this.list = list;
		this.httpCode = httpCode;
		this.wordGiven = wordGiven;
		this.infoOfRequest = infoOfRequest;
	}
	
}
