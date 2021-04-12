package com.chdatabase.sign.models;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import com.chdatabase.game.models.ClassGenre;
import com.chdatabase.sign.utils.contracts.SignModelContent;

import lombok.Getter;
import lombok.Setter;

@Entity(name = "signmodel")
@Getter
@Setter
public class SignModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(nullable = false)
	private String name;
	
	@Column(nullable = false)
	private String nickName;
	
	@Column(nullable = false)
	private String password;
	
	@OneToOne(cascade = CascadeType.ALL)
	private ClassGenre classGenre;
	
	public SignModel(String name, String nickName, String password, ClassGenre classGenre) {
		this.name = name;
		this.nickName = nickName;
		this.password = password;
		this.classGenre = classGenre;
	}
	
	public SignModel() {
		
	}
	
}
