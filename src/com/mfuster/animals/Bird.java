package com.mfuster.animals;

import com.mfuster.animals.AnimalGroup;

public class Bird extends Animal {
	
	private int airSpeed;

	public Bird(int quantityLegs, String color, int quantityEars, int quantityEyes, int age,
			AnimalGroup animalGroup, int airSpeed) {
		super(quantityLegs, color, quantityEars, quantityEyes, age, animalGroup);
		this.airSpeed=airSpeed;
	}

	public int getAirSpeed() {
		return airSpeed;
	}

	public void setAirSpeed(int airSpeed) {
		this.airSpeed = airSpeed;
	}
	
	@Override
	public String makeNoiseAway () {
		return "CUCUCÚ";		
	}

}
