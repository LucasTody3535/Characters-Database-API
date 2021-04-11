package com.chdatabase.game.models;

import javax.persistence.CascadeType;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.OrderColumn;

import lombok.Getter;
import lombok.Setter;

@Entity(name = "equipment")
@Getter
@Setter
public class Equipment {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@OneToOne(cascade = CascadeType.ALL)
	private Weapon weapon;
	
	@OneToOne(cascade = CascadeType.ALL)
	private Armor armor;
	
	@OneToMany(cascade = CascadeType.ALL)
	@ElementCollection
	@OrderColumn
	private Item[] items;

	public Equipment(Weapon weapon, Armor armor) {
		this.weapon = weapon;
		this.armor = armor;
	}
	
	public Equipment() {
		
	}

}
