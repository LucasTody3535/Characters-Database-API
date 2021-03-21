package com.chdatabase.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import com.chdatabase.daos.CharacterDataDAO;
import com.chdatabase.models.CharacterData;
import com.chdatabase.utils.errors.types.EmptyResultList;
import com.chdatabase.utils.errors.types.InvalidCharacterData;
import com.chdatabase.utils.validators.StringDataValidator;

@Controller
public class CharacterDataController {

	@Autowired
	private CharacterDataDAO dao;
	
	@Autowired
	private StringDataValidator validatorOfStrings;
	
	public CharacterData aproveCharacterData(CharacterData data) {
		CharacterData savedEntity = null;
		if(validatorOfStrings.validateStringLength(data.getName())) {
			if(validatorOfStrings.validateStringLength(data.getWork())) {
				savedEntity = dao.confirmSaveOfDataInDatabase(data);
			} else {
				throw new InvalidCharacterData("Nome da obra inválida", data.getWork());
			}
		} else {
			throw new InvalidCharacterData("Nome da personagem inválida", data.getName());
		}
		
		return savedEntity;
	}
	
	public CharacterData[] getCharacters(String wordGiven) {
		CharacterData[] obtainedEntities = this.dao.confirmGetOfDataInDatabase(wordGiven);
		
		if(obtainedEntities.length == 0) {			
			throw new EmptyResultList("Lista de resultados vazia", wordGiven);
		}
		
		return obtainedEntities;
	}
	
}
