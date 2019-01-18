package com.recipe.demo.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class UnitMeasure {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String uom;
	
	@OneToOne(fetch=FetchType.EAGER)
	private Ingredient ingredient;

	public UnitMeasure() {

	}

	public UnitMeasure(String uom, Ingredient ingredient) {
		this.uom = uom;
		this.ingredient = ingredient;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUom() {
		return uom;
	}

	public void setUom(String uom) {
		this.uom = uom;
	}

	public Ingredient getIngredient() {
		return ingredient;
	}

	public void setIngredient(Ingredient ingredient) {
		this.ingredient = ingredient;
	}

	@Override
	public String toString() {
		return "UnitMeasure [uom=" + uom + ", ingredient=" + ingredient + "]";
	}

}
