package com.chdatabase.game.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Entity(name = "armor")
@Getter
@Setter
public class Armor {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(nullable = false)
	private String name;
	
	@Column(nullable = false)
	private Integer power;
	
	public Armor(String name, Integer power) {
		this.name = name;
		this.power = power;
	}
	
	public Armor() {
		
	}
	
}
