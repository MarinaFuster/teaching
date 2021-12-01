package com.mfuster.animals;

import com.mfuster.animals.AnimalsInterface.AnimalsGroup;

public class Animals {

	private int quantityLegs;
	private String color;
	private int quantityEars;
	private int quantityEyes;
	private int age;
	private AnimalsGroup animalGroup;
	
	public Animals (int quantityLegs,String color,int quantityEars,int quantityEyes,int age,AnimalsGroup animalGroup)
	
	{
		this.quantityLegs=quantityLegs;
		this.color=color;
		this.quantityEars=quantityEars;
		this.quantityEars=quantityEars;
		this.age=age;
		this.animalGroup=animalGroup;
	}

	
	public int getQuantityLegs() {
		return quantityLegs;
	}
	public void setQuantityLegs(int quantityLegs) {
		this.quantityLegs = quantityLegs;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getQuantityEars() {
		return quantityEars;
	}
	public void setQuantityEars(int quantityEars) {
		this.quantityEars = quantityEars;
	}
	public int getQuantityEyes() {
		return quantityEyes;
	}
	public void setQuantityEyes(int quantityEyes) {
		this.quantityEyes = quantityEyes;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public AnimalsGroup getAnimalGroup() {
		return animalGroup;
	}
	public void setAnimalGroup(AnimalsGroup animalGroup) {
		this.animalGroup = animalGroup;
	}
	
	public String makeNoiseAway () {
		return "noise";
		
	}
	public String makeNoiseSleep () {
		return "noise";	
	}
}
