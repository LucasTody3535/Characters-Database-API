package com.chdatabase.game.models;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.Getter;
import lombok.Setter;

@Entity(name = "classgenre")
@Getter
@Setter
public class ClassGenre {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(nullable = false)
	private String className;
	
	@OneToOne(cascade = CascadeType.ALL)
	private Equipment equipment;
	
	public ClassGenre(String className, Equipment equipment) {
		this.className = className;
		this.equipment = equipment;
	}
	
	public ClassGenre() {
		
	}
	
}
