package com.mfuster.animals;

import com.mfuster.animals.AnimalsInterface.AnimalsGroup;
import com.mfuster.college.Student;

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
    	
    	Reptils reptilOne = new Reptils (3, "green",2,2, 34, AnimalsGroup.Reptils, 35);
    	Mammals mammalOne = new Mammals (3, "green",2,2, 34, AnimalsGroup.Reptils, 35);
    	Birds birdOne = new Birds (3, "green",2,2, 34, AnimalsGroup.Reptils, 35);
    	
    	System.out.println("Reptil noise away: ");
    	System.out.println(reptilOne.makeNoiseAway());
    	
    	System.out.println("Mammal noise away: ");
    	System.out.println(mammalOne.makeNoiseAway());
    	
    	System.out.println("Bird noise away: ");
    	System.out.println(birdOne.makeNoiseAway());

    }
   
}
