package com.mfuster.animals;

import com.mfuster.animals.AnimalGroup;

public class Reptil extends Animal{
	
	private int waterSpeed;
	
	public Reptil(int quantityLegs, String color, int quantityEars, int quantityEyes, int age,
			AnimalGroup animalGroup, int waterSpeed) {
		
		super(quantityLegs, color, quantityEars, quantityEyes, age, animalGroup);
		this.waterSpeed=waterSpeed;
	}

	public int getWaterSpeed() {
		return waterSpeed;
	}

	public void setWaterSpeed(int waterSpeed) {
		this.waterSpeed = waterSpeed;
	}
	
	@Override
	public String makeNoiseAway () {
		return "GRRRRR";		
	}
}
