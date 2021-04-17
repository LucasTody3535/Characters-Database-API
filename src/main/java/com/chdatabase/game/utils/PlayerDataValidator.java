package com.chdatabase.game.utils;

import org.springframework.stereotype.Component;

import com.chdatabase.game.models.PlayerData;
import com.chdatabase.utils.validators.BasicValidators;

@Component
public class PlayerDataValidator extends BasicValidators {

	public boolean validatePlayerFieldsIsNotInvalid(PlayerData dataToValidate) {
		if (this.validateIsNotNull(dataToValidate)) {			
			if (this.validateIsNotNull(dataToValidate.getNickName()) && this.validateIsNotEmpty(dataToValidate.getNickName())) {
				if (this.validateIsNotNull(dataToValidate.getHitPoints()) && this.validateIsNumberNotLessThanZero(dataToValidate.getHitPoints())) {
					if (this.validateIsNotNull(dataToValidate.getLevel()) && this.validateIsNumberNotLessThanZero(dataToValidate.getLevel())) {
						return true;
					}
				}
			}
		} return false;
	}
	
}
