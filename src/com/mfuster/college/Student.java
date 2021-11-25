package com.mfuster.college;

// HOMEWORK:
// Complete the class Student, where each student has:
//   - the name of college (it is the same for ALL students)
//   - the name of the student
//   - the lastname of the student
//   - the gpa of the student
//   Important things to consider:
//     - the name of the college, name of the student and lastname of the student cannot change.
public class Student {
	
	private String nameCollege ;
	private String nameStudent ;
	private String surnameStudent ;
	private double gpa;

public Student (String nameCollege, String nameStudent,String surnameStudent,int gpa) {
	this.nameCollege=nameCollege;
	this.nameStudent=nameStudent;
	this.surnameStudent=surnameStudent;
	this.setGpa(gpa);
}
	public String getNameCollege() {
		return nameCollege;
	}
	public void setNameCollege(String nameCollege) {
		this.nameCollege = nameCollege;
	}
	public String getNameStudent() {
		return nameStudent;
	}
	public void setNameStudent(String nameStudent) {
		this.nameStudent = nameStudent;
	}
	public String getSurnameStudent() {
		return surnameStudent;
	}
	public void setSurnameStudent(String surnameStudent) {
		this.surnameStudent = surnameStudent;
	}
	public double getGpa() {
		return gpa;
	}
	public void setGpa(double gpa) {
		this.gpa = gpa;
	}

}
