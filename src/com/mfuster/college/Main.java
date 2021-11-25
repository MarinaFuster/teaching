package com.mfuster.college;

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
    	Student numberOne = new Student ("MarinaCollege", "Napo","Devesa",8); 
    	Student numberTwo = new Student ("BaCollege", "Laura","Dal",4) ;

    	//Print the college name for all students.
    	String numberOneCollege= numberOne.getNameCollege();
    	String numberTwoCollege= numberTwo.getNameCollege();
    	System.out.println(numberOneCollege + " " +  numberTwoCollege);
    	
    	//Set gpa of 3.4 for first student and 2.4 for second student
    	numberOne.setGpa(3.4);
    	numberTwo.setGpa(2.4);
    	
    	//Print both students' names and lastnames
    	String numberOneName= numberOne.getNameStudent();
    	String numberOneSurname= numberOne.getSurnameStudent();
    	String numberTwoName= numberTwo.getNameStudent();
    	String numberTwoSurname= numberTwo.getSurnameStudent();

    	System.out.println("numberOne: ");
    	System.out.println(numberOneName + " " +  numberOneSurname);
    	
    	System.out.println("numberTwo: ");
    	System.out.println(numberTwoName + " " + numberTwoSurname);

    }
}