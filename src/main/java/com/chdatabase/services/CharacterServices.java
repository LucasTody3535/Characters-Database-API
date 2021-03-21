package com.chdatabase.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.chdatabase.controllers.CharacterDataController;
import com.chdatabase.models.CharacterData;
import com.chdatabase.utils.data_structures_for_messages.MessageContainerForCharactersSearch;
import com.chdatabase.utils.data_structures_for_messages.MessageContainerWhenCharactersIsSaved;
import com.chdatabase.utils.data_structures_for_messages.PrincipalMessageContainer;

@Service
@RestController
@RequestMapping("/characters")
@CrossOrigin
public class CharacterServices {
	
	@Autowired
	private CharacterDataController controller;

	@PostMapping(value = "/save", consumes = "application/json", produces = "application/json")
	public PrincipalMessageContainer saveOneCharacter(@RequestBody CharacterData data) {
		CharacterData savedData = controller.aproveCharacterData(data);
		return new PrincipalMessageContainer(new MessageContainerWhenCharactersIsSaved(savedData, HttpStatus.OK.value(), "Dados Salvos!"));
	}
	
	@GetMapping(value = "/obtain", produces = "application/json")
	public PrincipalMessageContainer getCharacters(@RequestParam String wordGiven) {
		CharacterData[] obtainedEntities = this.controller.getCharacters(wordGiven);
		return new PrincipalMessageContainer(new MessageContainerForCharactersSearch(obtainedEntities, HttpStatus.OK.value(), wordGiven, "Personagens encontrados"));
	}
	
	@PutMapping(value = "/update", consumes = "application/json", produces = "application/json")
	public PrincipalMessageContainer updateCharacter(@RequestBody CharacterData data) {
		CharacterData updatedData = controller.aproveCharacterData(data);
		return new PrincipalMessageContainer(new MessageContainerWhenCharactersIsSaved(updatedData, HttpStatus.OK.value(), "Dados Atualizados!"));
	}
	
}
