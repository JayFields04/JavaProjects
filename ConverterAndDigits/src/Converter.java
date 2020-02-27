/**
 * CS 110 Section 12
 * Lab #3 Part 1
 */

import java.util.Scanner;
public class Converter {

	public static void main(String[] args) {

//Reads Scanner in.
		Scanner in=new Scanner(System.in);
		
//Asks the user to enter number of minutes.
		System.out.println("Please enter number of minutes:");
		
//User will put number of minutes.
		long minutes= in.nextLong();

//Finding the years and the days of 
		long minOfaYear= 365*24*60;
		long years= minutes/minOfaYear;
		long days= (minutes % minOfaYear)/(24*60);

//Displays the years and days.
		System.out.println(minutes + " minutes is approximately "+ years+ " years and " +days+ " days.");
		
		in.close();
		
	}//main

}//class
