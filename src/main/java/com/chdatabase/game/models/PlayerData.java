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

@Entity(name = "PLAYER")
@Getter
@Setter
public class PlayerData {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(nullable = false, name = "NICKNAME", unique = true)
	private String nickName;
	
	@Column(nullable = false)
	private Long hitPoints;
	
	@OneToOne(cascade = CascadeType.ALL)
	private ClassGenre classGenre;

	public PlayerData(String nickName, Long hitPoints, ClassGenre classGenre) {
		this.nickName = nickName;
		this.hitPoints = hitPoints; 
		this.classGenre = classGenre;
	}
	
	public PlayerData() {
		
	}
	
}
