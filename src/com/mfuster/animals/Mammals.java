package com.mfuster.animals;

import com.mfuster.animals.AnimalsInterface.AnimalsGroup;

public class Mammals extends Animals{
	
	private int earthSpeed;


	public Mammals(int quantityLegs, String color, int quantityEars, int quantityEyes, int age,
			AnimalsGroup animalGroup, int earthSpeed) {
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
