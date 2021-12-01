package com.mfuster.animals;

import com.mfuster.animals.AnimalGroup;

//ABSTRACT crea una clase abstracta animal que no existe en la naturaleza. ABSTRACCIÓN.
//NO  inicia objetos/instancias

public abstract class Animal implements AnimalInterface {

	private int quantityLegs;
	private String color;
	private int quantityEars;
	private int quantityEyes;
	private int age;
	private AnimalGroup animalGroup;
	
	public Animal (int quantityLegs,String color,int quantityEars,int quantityEyes,int age,AnimalGroup animalGroup)
	
	{
		this.quantityLegs=quantityLegs;
		this.color=color;
		this.quantityEars=quantityEars;
		this.quantityEars=quantityEars;
		this.age=age;
		this.animalGroup=animalGroup;
	}
	//no setters because is not important to set.
	public int getQuantityLegs() {
		return quantityLegs;
	}
	public String getColor() {
		return color;
	}
	public int getQuantityEars() {
		return quantityEars;
	}
	public int getQuantityEyes() {
		return quantityEyes;
	}
	public int getAge() {
		return age;
	}
	public AnimalGroup getAnimalGroup() {
		return animalGroup;
	}	
	//this method return the noise of an animal going away
	public String makeNoiseAway () {
		return "noise";	
	}
	//this method return the noise of an animal going sleeping
	public String makeNoiseSleep () {
		return "noise";	
	}
}
