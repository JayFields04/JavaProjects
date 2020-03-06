/**
 * CS 110 Section 12
 * Lab 8
 */
import java.util.Scanner;
public class Fibonacci {

	public static void main(String[] args) {
		
// Asks for number
		System.out.println("Enter number to find the Fibinacci sequence");
		
//Reads scanner in
		Scanner in= new Scanner(System.in);
		
//Gets user input
		int num = in.nextInt();
 
		System.out.print("\nThe series up to "+num+" is: 0,");
		
//Uses for loop to read up to the number and prints Fibonacci sequence
		for (int i = 1; i <= num; i++) {
			System.out.print(fibFinder(i) + ",");
		}//for

//Closes Scanner
		in.close();
	}//main
 
	
// Class that finds the fib sequence
	public static int fibFinder(int num) {
		if (num == 1 || num == 2) {
			return 1;
		}//if
		
		else {
			return fibFinder(num - 1) + fibFinder(num - 2); 
		}//else
		
	}//fibFinder
		
		
	}//class


