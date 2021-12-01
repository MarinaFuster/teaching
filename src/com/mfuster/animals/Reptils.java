package com.mfuster.animals;

import com.mfuster.animals.AnimalsInterface.AnimalsGroup;

public class Reptils extends Animals{
	
	private int waterSpeed;
	

	public Reptils(int quantityLegs, String color, int quantityEars, int quantityEyes, int age,
			AnimalsGroup animalGroup, int waterSpeed) {
		
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
