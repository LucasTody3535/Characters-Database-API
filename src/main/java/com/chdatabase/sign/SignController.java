package com.chdatabase.sign;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.chdatabase.game.errors_treatment.errors_type.InvalidPlayerData;
import com.chdatabase.game.utils.PlayerDataValidator;
import com.chdatabase.sign.models.SignModel;
import com.chdatabase.sign.utils.errors_treatment.errors_types.InvalidSignFields;
import com.chdatabase.sign.utils.validators.SignModelValidator;

@Component
public class SignController {
	
	@Autowired
	private SignDAO dao;
	
	@Autowired
	private SignModelValidator validatorOfSignModelFields;
	
	public SignModel verifyContentOfSignModelBeforeSave(SignModel model) {
		if (this.validatorOfSignModelFields.validateIsNotNull(model.getName()) && this.validatorOfSignModelFields.validateIsNotEmpty(model.getName())) {
			if (this.validatorOfSignModelFields.validateIsNotNull(model.getPassword()) && this.validatorOfSignModelFields.validateIsNotEmpty(model.getPassword())) {
				if (this.validatorOfSignModelFields.validateIsNotNull(model.getData())) {
					if (this.validatorOfSignModelFields.validateIsNotNull(model.getData().getNickName()) && this.validatorOfSignModelFields.validateIsNotEmpty(model.getData().getNickName())) {
						if (this.validatorOfSignModelFields.validateIsNotNull(model.getData().getHitPoints()) && this.validatorOfSignModelFields.validateIsNumberIsEqualsToOneHundred(model.getData().getHitPoints())) {
							if (this.validatorOfSignModelFields.validateIsNotNull(model.getData().getLevel()) && this.validatorOfSignModelFields.validateIsNumberEqualsOne(model.getData().getLevel())) {								
								return this.dao.save(model);
							} throw new InvalidPlayerData("Não foi possível realizar cadastro!", "Level inválido! Esperado: 1");
						} throw new InvalidPlayerData("Não foi possível realizar cadastro!", "Hit points inválidos! Esperado: 100");
					} throw new InvalidPlayerData("Não foi possível realizar cadastro!", "Nickname inválido");
				} throw new InvalidPlayerData("Não foi possível realizar cadastro!", "Dados do jogador nulos!");
			} throw new InvalidSignFields("Não foi possível realizar cadastro!", "Senha inválida!");
		} throw new InvalidSignFields("Não foi possível realizar cadastro!", "Nome inválido!");
	}

}
