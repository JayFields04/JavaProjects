/**
 * CS 110 Section 12
 * Lab 5
 */
import java.util.Scanner;

public class Replace {

	public static void main(String[] args) {
		
//Reads Scanner in
		Scanner in= new Scanner(System.in);

//Asks user to enter a string of words		
		System.out.println("Enter a sentence to switch the first and last word.");

//Gets user input
		String sentence=in.nextLine();
		
//Trims and leading and trailing spaces
		String sentence2= sentence.trim();
		
//Separates words by white spaces
		String []spaces=sentence2.split(" ");		
		
//First and last words by using an array
		String first=spaces[0];
		String last=spaces[spaces.length-1];

//Finding the middle
		int firstSpace=sentence2.indexOf(" ");
		int lastSpace= sentence2.lastIndexOf(" ");
		String middleWords= sentence2.substring(firstSpace+1, lastSpace);
		
//Gives replaced words
		System.out.println(last + " " + middleWords + " " + first );

//Closes Scanner
		in.close();

	}//main

}//class
