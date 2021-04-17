package com.chdatabase.sign;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.chdatabase.game.errors_treatment.errors_type.InvalidClassGenre;
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
		this.validatorOfFields.validateIsNotNull(model.getData().getNickName()) &&
		this.validatorOfFields.validateIsNotNull(model.getPassword()) &&
		this.validatorOfFields.validateIsNotNull(model.getData().getClassGenre())
		)
		{	
			
			if (
			this.validatorOfFields.validateIsNotEmpty(model.getName()) &&
			this.validatorOfFields.validateIsNotEmpty(model.getData().getNickName()) &&
			this.validatorOfFields.validateIsNotEmpty(model.getPassword())
			)
			{
				
				if (this.validatorOfFields.validateClassGenreItems(model.getData().getClassGenre())){
					return this.dao.save(model);
				} else {
					throw new InvalidClassGenre("Dados de classe inválidos!");
				}
				
			} else {
				throw new EmptyContentPointerException("Campo Vazio!");
			}
			
		} else {
			throw new NullPointerExceptionCustomized("Campo nulo!");
		}
	}

}
