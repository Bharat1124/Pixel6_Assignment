package com.example.demo.entity;

import java.util.Arrays;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;

@Entity
public class AnimalEntity {

	@Id
	private Long animalID;
	
	 private String name;
	 private String category;
	 private String description;
	 private String lifeExpectancy;
	 
	 @Lob
	  private byte[] image; // Store image data as byte array

	public Long getAnimalID() {
		return animalID;
	}

	public void setAnimalID(Long animalID) {
		this.animalID = animalID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getLifeExpectancy() {
		return lifeExpectancy;
	}

	public void setLifeExpectancy(String lifeExpectancy) {
		this.lifeExpectancy = lifeExpectancy;
	}

	public byte[] getImage() {
		return image;
	}

	public void setImage(byte[] image) {
		this.image = image;
	}

	public AnimalEntity(Long animalID, String name, String category, String description, String lifeExpectancy,
			byte[] image) {
		super();
		this.animalID = animalID;
		this.name = name;
		this.category = category;
		this.description = description;
		this.lifeExpectancy = lifeExpectancy;
		this.image = image;
	}

	public AnimalEntity() {
	}

	@Override
	public String toString() {
		return "AnimalEntity [animalID=" + animalID + ", name=" + name + ", category=" + category + ", description="
				+ description + ", lifeExpectancy=" + lifeExpectancy + ", image=" + Arrays.toString(image) + "]";
	}

	
	
}
