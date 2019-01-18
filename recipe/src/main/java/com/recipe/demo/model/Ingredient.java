package com.recipe.demo.model;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Ingredient {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;
	
	@Lob
	String description;
	@Lob
	BigDecimal amount;
	
	
	@ManyToOne(fetch=FetchType.EAGER)
	Recipe recipe;
	
	@OneToOne(fetch=FetchType.EAGER)
	UnitMeasure unitMeasure;

	public Ingredient() {

	}

	public Ingredient(String description, BigDecimal amount, Recipe recipe, UnitMeasure unitMeasure) {
		this.description = description;
		this.amount = amount;
		this.recipe = recipe;
		this.unitMeasure = unitMeasure;
	}
	
	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public Recipe getRecipe() {
		return recipe;
	}

	public void setRecipe(Recipe recipe) {
		this.recipe = recipe;
	}

	public UnitMeasure getUnitMeasure() {
		return unitMeasure;
	}

	public void setUnitMeasure(UnitMeasure unitMeasure) {
		this.unitMeasure = unitMeasure;
	}

	@Override
	public String toString() {
		return "Ingredient [description=" + description + ", amount=" + amount + ", recipe=" + recipe + ", unitMeasure="
				+ unitMeasure + "]";
	}

}
