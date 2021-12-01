package com.mfuster.animals;

import com.mfuster.animals.AnimalGroup;

// Create a program where you can initialize different types of animals
// All animals have:
//   - quantity of legs,
//   - color,
//   - quantity of eyes,
//   - quantity of ears,
//   - age.
//   - animal group.
// All animals can:
//   - make a sound when they are away
//   - make a sound when they are asleep: ALL animals make the same sound when being asleep

// Animal groups can be reptiles, birds, mammals, etc. Animals from an animal group have specific attributes and
// behaviour to that animal. For example birds can fly.

// Design a program where you can initialize different animals. You need at least three animal groups
// and one animal for each group. Create an example main to show the program functionality.
// Example: Birds, Reptiles and Mammals with respective Eagle, Anaconda and Dog.

public class Main {
    public static void main(String[] args) {
    	
    	//creating the tree animals program
    	Reptil reptilOne = new Reptil (3, "green",2,2, 34, AnimalGroup.Reptils, 35);
    	Mammal mammalOne = new Mammal (3, "green",2,2, 34, AnimalGroup.Mammals, 35);
    	Bird birdOne = new Bird (3, "green",2,2, 34, AnimalGroup.Birds, 35);
    	
    	System.out.println("Reptil noise away: ");
    	System.out.println(reptilOne.makeNoiseAway());
    	
    	System.out.println("Mammal noise away: ");
    	System.out.println(mammalOne.makeNoiseAway());
    	
    	System.out.println("Bird noise away: ");
    	System.out.println(birdOne.makeNoiseAway());

    }
   
}
