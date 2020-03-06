/**
 * CS 110 Section 12
 * Lab #2
 */
import java.util.Scanner;

public class Series {

	public static void main(String[] args) {

//Reads the Scanner in.
	Scanner in= new Scanner(System.in);

//Asks the user to enter an integer
	System.out.println("Please enter an integer");

//User will enter a number
	int n= in.nextInt();

//Displays the sum of the series
	System.out.println("The sum of the series from 1 to "+ n+ " is: "+ ((n*(n+1))/2) );

//Closes scanner
	in.close();
	}

}
