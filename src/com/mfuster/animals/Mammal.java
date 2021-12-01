package com.mfuster.animals;

import com.mfuster.animals.AnimalGroup;

public class Mammal extends Animal{
	
	private int earthSpeed;

	public Mammal(int quantityLegs, String color, int quantityEars, int quantityEyes, int age,
			AnimalGroup animalGroup, int earthSpeed) {
		super(quantityLegs, color, quantityEars, quantityEyes, age, animalGroup);
		this.earthSpeed=earthSpeed;
	}

	public int getEarthSpeed() {
		return earthSpeed;
	}

	public void setEarthSpeed(int earthSpeed) {
		this.earthSpeed = earthSpeed;
	}
	
	@Override
	public String makeNoiseAway () {
		return "TAMTAMTAM";	
	}
}
