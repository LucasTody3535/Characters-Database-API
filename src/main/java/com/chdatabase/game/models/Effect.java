package com.chdatabase.game.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity(name = "effect")
@Getter
@Setter
public class Effect {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(nullable = false)
	private Integer value;
	
	@Column(nullable = false)
	private String category;
	
	public Effect(Integer value, String category) {
		this.value = value;
		this.category = category;
	}
	
	public Effect() {
		
	}
	
}
