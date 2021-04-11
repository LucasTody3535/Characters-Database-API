package com.chdatabase.sign;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.chdatabase.sign.models.SignModel;
import com.chdatabase.sign.utils.validators.SignModelValidator;
import com.chdatabase.utils.errors_treatment.errors_types.EmptyContentPointerException;
import com.chdatabase.utils.errors_treatment.errors_types.NullPointerExceptionCustomized;

@Component
public class SignController {
	
	@Autowired
	private SignDAO dao;
	
	@Autowired
	private SignModelValidator validatorOfFields;
	
	public SignModel verifyContent(SignModel model) {
		if (
		this.validatorOfFields.validateIsNotNull(model.getName()) &&
		this.validatorOfFields.validateIsNotNull(model.getNickName()) &&
		this.validatorOfFields.validateIsNotNull(model.getPassword()) &&
		this.validatorOfFields.validateIsNotNull(model.getClassGenre())
		)
		{	
			
			if (
			this.validatorOfFields.validateIsNotEmpty(model.getName()) &&
			this.validatorOfFields.validateIsNotEmpty(model.getNickName()) &&
			this.validatorOfFields.validateIsNotEmpty(model.getPassword())
			)
			{
				
				if (this.validatorOfFields.validateClassGenreItems(model.getClassGenre())){					
					return this.dao.save(model);
				}
				
			} else {
				throw new EmptyContentPointerException("Campo Vazio!");
			}
			
		} else {
			throw new NullPointerExceptionCustomized("Campo nulo!");
		}
		return null;
	}

}
