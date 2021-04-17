package com.chdatabase.game.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Entity(name = "weapon")
@Getter
@Setter
public class Weapon {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(nullable = false)
	private String name;
	
	@Column(nullable = false)
	private Integer power;
	
	@Column(nullable = false)
	private String designedClass;
	
	public Weapon(String name, Integer power, String designedClass) {
		this.name = name;
		this.power = power;
		this.designedClass = designedClass;
	}
	
	public Weapon() {
		
	}
	
}
