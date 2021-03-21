package com.chdatabase.models;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OrderColumn;

import lombok.Getter;
import lombok.Setter;

@Entity(name = "character")
@Getter
@Setter
public class CharacterData {	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(nullable = false, length = 30)
	private String name;
	
	@Column(nullable = false, length = 30)
	private String work;
	
	@Column(nullable = false)
	private String sex;
	
	@Column(nullable = false, length = 350)
	private String about;
	
	@Column(nullable = false)
	private Long likes;
	
	@OrderColumn
	@ElementCollection
	private List<String> imgs;
	
	public CharacterData(Long id, String name, String work, String sex, String about, Long likes, List<String> imgs) {
		this.id = id;
		this.name = name;
		this.work = work;
		this.sex = sex;
		this.about = about;
		this.likes = likes;
		this.imgs = imgs;
	}
	
	public CharacterData() {
		
	}
		
}
