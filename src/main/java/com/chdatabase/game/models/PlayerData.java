package com.chdatabase.game.models;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import lombok.Getter;
import lombok.Setter;

@Entity(name = "PLAYER")
//Definição de atributos que serão únicos para cada entidade
@Table(name = "PLAYER", uniqueConstraints = @UniqueConstraint(columnNames = {"NICKNAME"}))
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
	
	@Column(nullable = false)
	private Long level;
	
	@OneToOne(cascade = CascadeType.ALL)
	private ClassGenre classGenre;

	public PlayerData(String nickName, Long hitPoints, Long level, ClassGenre classGenre) {
		this.nickName = nickName;
		this.hitPoints = hitPoints;
		this.level = level;
		this.classGenre = classGenre;
	}
	
	public PlayerData() {
		
	}
	
}
