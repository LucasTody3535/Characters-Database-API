package com.chdatabase.sign;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.chdatabase.sign.models.SignModel;

@Component
public class SignController {
	
	@Autowired
	private SignDAO dao;
	
	public SignModel verifyContent(SignModel model) {
		return this.dao.save(model);
	}

}
