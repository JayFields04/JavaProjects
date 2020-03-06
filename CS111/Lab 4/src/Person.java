/** 
 * CS 111 Section 2
 * Lab Assignment 3
 * Jaquez Fields
 */

import java.util.Calendar;

public class Person{
  
  private String firstName;
  private String lastName;
  private Date dob;
  
  //null contructor
  public Person(){
    this.firstName="AAAA";
    this.lastName="BBBB";
    this.dob=new Date();
  }//person
  
  //constructor which takes firstname,lastname and age
  public Person(String first,String last,Date dob){
    this.firstName=first;
    this.lastName=last;
    this.dob=dob;
    
  }//person
  
 
  //getter for DateOfBirth
  public Date getDOB(){
    return this.dob;
    
  }//getDOB
  
  //Getter for first name
  public String getFirst(){
    return this.firstName
    		;
  }//getFirst
  
  //Getter for last name
  public String getLast(){
    return this.lastName;
    
  }//getLast
  
 //Uses class calender to get age
  private int getAge() {
	  return ((Calendar.getInstance().get(Calendar.YEAR))-dob.getYear());
	  
  }//getAge
  
  //String method to return Name and Age
  public String toString() {
	  return "First: " + firstName+"| Last: "+lastName + "| Age: "+ getAge();
	  
  }//toString
  
  //Checks if two people are the same
  public boolean equals(Object a) {
	  
	  return (a instanceof Person) && this.firstName.equals(((Person)a).firstName) && this.lastName.equals(((Person)a).lastName)
			  && this.dob.equals(((Person)a).dob);
	  
  }//equals
    
}//class
