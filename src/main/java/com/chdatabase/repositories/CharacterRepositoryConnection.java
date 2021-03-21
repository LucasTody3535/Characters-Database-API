package com.chdatabase.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.chdatabase.models.CharacterData;

@Repository
public interface CharacterRepositoryConnection extends CrudRepository<CharacterData, Long>, JpaRepository<CharacterData, Long> {

	@Query(value = "SELECT * FROM character WHERE name LIKE %?%", nativeQuery = true)
	public CharacterData[] findByWordGiven(String wordGiven);
	
}
