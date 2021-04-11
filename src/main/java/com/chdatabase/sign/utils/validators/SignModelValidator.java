package com.chdatabase.sign.utils.validators;

import com.chdatabase.game.models.Armor;
import com.chdatabase.game.models.ClassGenre;
import com.chdatabase.game.models.Item;
import com.chdatabase.game.models.Weapon;

public class SignModelValidator {

	public boolean validateIsNotNull(String fieldToValidate) {
		return fieldToValidate != null;
	}
	
	public boolean validateIsNotNull(Object fieldToValidate) {
		return fieldToValidate != null;
	}
	
	public boolean validateIsNotEmpty(String fieldToValidate) {
		return fieldToValidate != "";
	}
	
	public boolean validateIsNumberNotLessThanZero(Integer number) {
		return number.intValue() > 0;
	}
	
	//Valia campos do Objeto ClassGenre
	public boolean validateClassGenreItems(ClassGenre classGenre) {
		if (
				this.validateIsNotNull(classGenre.getClassName()) &&
				this.validateIsNotNull(classGenre.getEquipment()) &&
				this.validateIsNotNull(classGenre.getEquipment().getWeapon()) &&
				this.validateIsNotNull(classGenre.getEquipment().getArmor()) &&
				this.validateIsNotNull(classGenre.getEquipment().getItems()) &&
				this.validateWeaponOrArmorFields(classGenre.getEquipment().getWeapon()) &&
				this.validateWeaponOrArmorFields(classGenre.getEquipment().getArmor()) &&
				this.validateItemsFields(classGenre.getEquipment().getItems())
			)
		{
			return true;
		}
		return false;
	}
	
	//Valida campos do Objeto Weapon
	private boolean validateWeaponOrArmorFields(Weapon armorOrWeapon) {
		if (
				this.validateIsNotNull(armorOrWeapon.getName()) &&
				this.validateIsNotNull(armorOrWeapon.getPower())
			)
		{
			if (
					this.validateIsNotEmpty(armorOrWeapon.getName()) &&
					this.validateIsNumberNotLessThanZero(armorOrWeapon.getPower())
				)
			{
				return true;
			}
		}
		return false;
	}
	
	//Valida campos do Objeto Armor
	private boolean validateWeaponOrArmorFields(Armor armorOrWeapon) {
		if (
				this.validateIsNotNull(armorOrWeapon.getName()) &&
				this.validateIsNotNull(armorOrWeapon.getPower())
			)
		{
			if (
					this.validateIsNotEmpty(armorOrWeapon.getName()) &&
					this.validateIsNumberNotLessThanZero(armorOrWeapon.getPower())
				)
			{
				return true;
			}
		}
		return false;
	}
	
	//Valida campos do Objeto Item
	private boolean validateItemsFields(Item itens) {
		if (
				this.validateIsNotNull(itens.getName()) &&
				this.validateIsNotNull(itens.getEffect()) &&
				this.validateIsNotNull(itens.getEffect().getFieldAffected()) &&
				this.validateIsNotNull(itens.getEffect().getValue())
			)
		{
			if (
					this.validateIsNotEmpty(itens.getName()) &&
					this.validateIsNotEmpty(itens.getEffect().getFieldAffected()) &&
					this.validateIsNumberNotLessThanZero(itens.getEffect().getValue())
				)
			{
				return true;
			}
		}
		return false;
	}
	
	private boolean validateItemsFields(Item[] itens) {
		for(int i = 0; i < itens.length; i++) {
			Item selectedItem = itens[i];
			if (
					this.validateIsNotNull(selectedItem.getName()) &&
					this.validateIsNotNull(selectedItem.getEffect()) &&
					this.validateIsNotNull(selectedItem.getEffect().getFieldAffected()) &&
					this.validateIsNotNull(selectedItem.getEffect().getValue())
					)
			{
				if (
						this.validateIsNotEmpty(selectedItem.getName()) &&
						this.validateIsNotEmpty(selectedItem.getEffect().getFieldAffected()) &&
						this.validateIsNumberNotLessThanZero(selectedItem.getEffect().getValue())
						)
				{
					return true;
				}
			}
		}
		return false;
	}
	
}
