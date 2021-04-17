package com.chdatabase.game.models;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OrderColumn;

import lombok.Getter;
import lombok.Setter;

@Entity(name = "item")
@Getter
@Setter
public class Item {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(nullable = false)
	private String name;

	@Column(nullable = false)
	private String description;
	
	@Column(nullable = false)
	private Long quantityOfItems;
	
	@OneToMany(cascade = CascadeType.ALL)
	@OrderColumn
	private Effect[] effect;
	
	public Item(String name, String description, Long quantityOfItems, Effect[] effect) {
		this.name = name;
		this.description = description;
		this.quantityOfItems = quantityOfItems;
		this.effect = effect;
	}
	
	public Item() {
		
	}
	
}
