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
    	
    	//Print the college name for all students.
    	System.out.println("The name of all students college:");	
    	printNameCollege("Marina College");
    	
    	//Create two students (you can choose their names)
    	Student [] students = new Student [2];
    	students[0] = new Student (null, "Napo","Devesa",0); 
    	students[1] = new Student (null, "Laura","Dal",0) ;
   
    	//Set gpa of 3.4 for first student and 2.4 for second student
    	students[0].setGpa(3.4);
    	students[1].setGpa(2.4); 	
    	
    	for (int i = 0 ; i<2; i++) {
        	printName(students[i].getNameStudent(), students[i].getSurnameStudent());
    	}

    	//Set gpa of 3.8 for first student
    	students[0].setGpa(3.8);
    	System.out.println(students[0].getGpa());	
    	
    }

		private static void printName(String nameStudent, String surnameStudent) {
			System.out.println(nameStudent + " " + surnameStudent);		
		}
		
		private static void printNameCollege(String college){
			System.out.println(college);		
		}	
		
	}
