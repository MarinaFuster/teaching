package com.mfuster.animals;

import com.mfuster.animals.AnimalsInterface.AnimalsGroup;

public class Mammals extends Animals{

	public Mammals(int quantityLegs, String color, int quantityEars, int quantityEyes, int age,
			AnimalsGroup animalGroup) {
		super(quantityLegs, color, quantityEars, quantityEyes, age, animalGroup);
	}

}
