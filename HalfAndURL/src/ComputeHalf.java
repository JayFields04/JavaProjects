/**
 * CS 110 Section 12
 * Lab #4 Part 1
 */
import java.util.Scanner;

public class ComputeHalf {

	public static void main(String[] args) {
		
//Reading scanner in.
		Scanner in= new Scanner(System.in);
		
//Ask user to write a word.
		System.out.println("Please enter a word to compute half of it.");
		
//Creates String so user can have input.
		String whole=in.next();
		
//Gives the user the amount of letters in the word.
		System.out.println("The word "+whole+ " is "+whole.length()+" characters long.");
		
//Prints out half of the String.
		System.out.println("The first half of it is: "+ whole.substring(0, whole.length()/2));

//Closes Scanner.
		in.close();
		
	}//main

}//class
