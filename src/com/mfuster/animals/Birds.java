package com.mfuster.animals;

import com.mfuster.animals.AnimalsInterface.AnimalsGroup;

public class Birds extends Animals {
	
	private int airSpeed;


	public Birds(int quantityLegs, String color, int quantityEars, int quantityEyes, int age,
			AnimalsGroup animalGroup, int airSpeed) {
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
