/** 
 * CS 111 Section 2
 * Lab Assignment 3
 * Jaquez Fields
 */

//Extends the parent class
public class Student extends Person {
	
	private double gpa;
	private int studentID;
	private Teacher advisor;

//Default Constructor	
	public Student(){
		this.gpa= 0.0;
		this.studentID=0;
		this.advisor= advisor;
		
	}//Student
	
//Parameterized constructor that uses super
	public Student(String firstname, String lastname, Date dob, double gpa, int studentID, Teacher adv) {
		super(firstname,lastname, dob);
		
		this.gpa= gpa;
		this.studentID=studentID;
		this.advisor=adv;
		
	}//Student
	
//Gets studentID	
	public int getID (){
		return this.studentID;
		
	}//getIF

//Gets the GPA for the student
	public double getGPA(){
		return this.gpa;
		
	}//getGPA
	
//gets the advisor for the student	
	public Teacher advisor() {
		return this.advisor;
		
	}//getAdvisor

//toString that uses super class and overrides with its added methods		
	@Override
	public String toString() {
		return "Student[" + super.toString()+"| gpa:"+ gpa+ "| studentID: "+ studentID+ "| advisor:"+ advisor+ "]";
		
	}//toString
	
}//class
