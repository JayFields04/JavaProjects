/**
 * CS 110 Section 12
 * Lab 11
 */

import java.util.Scanner;

public class printFrequency {

	public static void main(String[] args) {
	
//Importing Scanner
		Scanner in=new Scanner(System.in);
		
//Initializing count and number as integers
		int count=0;
		int number,i,j,z;

//Asks for the length of the array
		System.out.print("Enter the length of the array:");

//Gets user input to determine the size of the array
		number=in.nextInt();
		
//Declaring the array and its size
		int[]array= new int[number];

//Asks for the numbers to 
		System.out.println("Enter elements to find the frequency of numbers");

//For and if loops that allows user input and finds the frequency of numbers
		for(i=0;i<number;i++){
			z = in.nextInt();
			array[i] = z;
		}//for

		for(i=0;i<number;i++){
			count=1;

			for(j=i+1;j<=number-1;j++){

				if(array[i]==array[j] && array[i]!=0){
					count++;
					array[j] = 0;
				}//if
			}//for

			if(array[i]!=0){
				System.out.println("Integer "+array[i] + " has frequency " + count);

			}//if
		}//for
		
//Closes Scanner
		in.close();
		
	}//main

}//class
