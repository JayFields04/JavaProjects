/** 
 * CS 111 Section 2
 * Lab Assignment 3
 * Jaquez Fields
 */

public class Teacher extends Person {
	
	private String department;
	
//Default constructor that sets department to CCCC	
	public Teacher() {
		this.department= "CCCC";
		
	}//Teacher
	
//Paramerterized constructor that uses superclass to get name and age	
	public Teacher(String firstname,String lastname,Date dob,String department) {
		super(firstname, lastname, dob);
		this.department= department;
		
	}//Teacher

//Getter for department	
	public String getDepartment() {
		return this.department;
		
	}//getDepartment
	
//toString that uses super class and overrides with its added methods	
	@Override
	public String toString() {
		return "Teacher["+ super.toString()+ "| Department:"+ department+"]";
		
	}//toString
}//class
