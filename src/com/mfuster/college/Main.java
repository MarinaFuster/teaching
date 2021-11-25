package com.mfuster.college;

import java.time.LocalDate;
// HOMEWORK:
//   - Print the college name for all students.
//   - Create two students (you can choose their names)
//   - Set gpa of 3.4 for first student and 2.4 for second student
//   - Print both students' names and lastnames
//   - Set gpa of 3.8 for first student
//   IMPORTANT
//     - You must be able to complete this in order
public class Main {
    public static void main(String[] args) {
 	
    	//Create two students (you can choose their names)
    	Student numberOne = new Student ("Marina College", "Napo","Devesa",0); 
    	Student numberTwo = new Student ("Ba College", "Laura","Dal",0) ;

    	//Print the college name for all students.
    	String numberOneCollege= numberOne.getNameCollege();
    	String numberTwoCollege= numberTwo.getNameCollege();
    	
    	printNameCollege(numberOneCollege);
    	printNameCollege(numberTwoCollege);
   
    	//Set gpa of 3.4 for first student and 2.4 for second student
    	numberOne.setGpa(3.4);
    	numberTwo.setGpa(2.4); 	

    	String numberOneName= numberOne.getNameStudent();
    	String numberOneSurname= numberOne.getSurnameStudent();
    	
    	String numberTwoName= numberTwo.getNameStudent();
    	String numberTwoSurname= numberTwo.getSurnameStudent();

    	printName(numberTwoName, numberTwoSurname);
    	printName(numberOneName, numberOneSurname);
    	
    	//Set gpa of 3.8 for first student
    	numberOne.setGpa(3.8);
    	System.out.println(numberOne.getGpa());	
    	
    }

		private static void printName(String nameStudent, String surnameStudent) {
			System.out.println(nameStudent + " " + surnameStudent);		
		}
		
		private static void printNameCollege(String nameCollege) {
			System.out.println(nameCollege );		
		}	
		
	}
