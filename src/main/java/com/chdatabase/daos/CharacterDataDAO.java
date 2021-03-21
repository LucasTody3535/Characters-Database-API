package com.chdatabase.daos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.chdatabase.models.CharacterData;
import com.chdatabase.repositories.CharacterRepositoryConnection;

@Component
public class CharacterDataDAO {
	
	@Autowired
	private CharacterRepositoryConnection repository;
	
	public CharacterData confirmSaveOfDataInDatabase(CharacterData data) {
		CharacterData dataSaved = repository.save(data);
		return dataSaved;
	}
	
	public CharacterData[] confirmGetOfDataInDatabase(String wordGiven) {
		CharacterData[] data = this.repository.findByWordGiven(wordGiven);
		return data;
	}
	
}
