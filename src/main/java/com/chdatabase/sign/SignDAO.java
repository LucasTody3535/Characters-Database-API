package com.chdatabase.sign;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.chdatabase.sign.models.SignModel;

@Component
public class SignDAO {
	
	@Autowired
	private SignRepository repository;

	public SignModel save(SignModel model) {
		return this.repository.save(model);
	}
	
}
