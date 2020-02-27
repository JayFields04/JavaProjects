/**
 * CS 110 Section 12
 * Lab 11
 */

import java.util.Scanner;

public class findMaxima {

	public static void main(String[] args) {
		
//Importing Scanner
		Scanner in=new Scanner(System.in);
				
//Initializing count and number as integers
		int number,z,max,i;
		

//Asks for the length of the array
		System.out.print("Enter the length of the array:");

//Gets user input to determine the size of the array
		number=in.nextInt();
		
		System.out.println("Enter "+ number + " numbers.");
				
//Declaring the array and its size
		int[]array= new int[number];
	
//For and if loop to find the max of the users input		
		for(i=0;i<number;i++){
			z = in.nextInt();
			array[i] = z;
		}//for	
		max=array[0];
		for ( i=1;i<array.length;i++) {
			if(array[i]>max) {
				max=array[i];
			}
		}
		System.out.println("Maximas in the given array are:"+ max);
		
//Closes Scanner
		in.close();
	}//main
	
}//class
