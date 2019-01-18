package com.recipe.demo.model;

import java.util.Arrays;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Recipe {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;
	
	@Lob
	String description;
	Integer prepTime;
	Integer cookTime;
	Integer servings;
	@Lob
	String source;
	String url;
	String directions;
	//Diffuculty diffuculty;
	
	@Lob
	Byte[] image;
	
	@OneToMany(cascade=CascadeType.ALL, mappedBy= "recipe",
			fetch=FetchType.LAZY)
	Set <Ingredient> ingredients;
	
	@OneToOne(cascade=CascadeType.ALL, fetch=FetchType.EAGER)
	Notes notes;
	

	public Recipe() {

	}

	public Recipe(String description, Integer prepTime, Integer cookTime, Integer servings, String source,
			String url, String directions, Diffuculty diffuculty, Byte[] image, Set<Ingredient> ingredients,
			Notes notes) {
		
		this.description = description;
		this.prepTime = prepTime;
		this.cookTime = cookTime;
		this.servings = servings;
		this.source = source;
		this.url = url;
		this.directions = directions;
		//this.diffuculty = diffuculty;
		this.image = image;
		this.ingredients = ingredients;
		this.notes = notes;
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

	public Integer getPrepTime() {
		return prepTime;
	}

	public void setPrepTime(Integer prepTime) {
		this.prepTime = prepTime;
	}

	public Integer getCookTime() {
		return cookTime;
	}

	public void setCookTime(Integer cookTime) {
		this.cookTime = cookTime;
	}

	public Integer getServings() {
		return servings;
	}

	public void setServings(Integer servings) {
		this.servings = servings;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getDirections() {
		return directions;
	}

	public void setDirections(String directions) {
		this.directions = directions;
	}
    /*
	public Diffuculty getDiffuculty() {
		return diffuculty;
	}

	public void setDiffuculty(Diffuculty diffuculty) {
		this.diffuculty = diffuculty;
	} */

	public Byte[] getImage() {
		return image;
	}

	public void setImage(Byte[] image) {
		this.image = image;
	}

	public Set<Ingredient> getIngredients() {
		return ingredients;
	}

	public void setIngredients(Set<Ingredient> ingredients) {
		this.ingredients = ingredients;
	}

	public Notes getNotes() {
		return notes;
	}

	public void setNotes(Notes notes) {
		this.notes = notes;
	}

	@Override
	public String toString() {
		return "Recipe [id=" + id + ", description=" + description + ", prepTime=" + prepTime + ", cookTime=" + cookTime
				+ ", servings=" + servings + ", source=" + source + ", url=" + url + ", directions=" + directions
				+ ", image=" + Arrays.toString(image) + ", ingredients=" + ingredients
				+ ", notes=" + notes + "]";
	}
		

}
