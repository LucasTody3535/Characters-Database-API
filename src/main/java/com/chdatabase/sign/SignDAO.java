package com.chdatabase.sign;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.chdatabase.sign.models.SignModel;
import com.chdatabase.sign.utils.errors_treatment.errors_types.SaveInDatabaseException;

@Component
public class SignDAO {
	
	@Autowired
	private SignRepository repository;

	public SignModel save(SignModel model) {
		try {			
			return this.repository.save(model);
		} catch (Exception e) {
			throw new SaveInDatabaseException("Nickname já existente!");
		}
	}
}
