/**
 * CS 110 Section 12
 * Lab 10
 */

import java.util.Scanner;
import java.io.*;

public class textFile {

	public static void main(String[] args) throws FileNotFoundException {

//initializes all values
	int count=0, sum= 0, largest= Integer.MIN_VALUE, smallest= Integer.MAX_VALUE;
	double average=0.0;

//finds all needed values when file is found
try {
	
//Reads the text file
	Scanner in = new Scanner(new FileReader("sample.txt"));

//
		while (in.hasNextInt()) {
		    int number = in.nextInt();
		    if (number < smallest)
		        smallest = number;
		    if (number > largest)
		        largest = number;
		    sum+= number;
		    count++;
		    
		 }//while
		
		 average = (double)sum / count;

//Prints the values		 
		 System.out.println("The smallest number is: " +smallest);
		 System.out.println("The largest number is: "+ largest);
		 System.out.println("The sum is: " +sum);
		 System.out.println("There are "+ count+ " total numbers");
		 System.out.println("The average is: "+ average);
}

//Catches if there is something wrong with finding the file and gives message
catch(Exception e){
	System.out.println("Error with the file check spelling and try again");
}
	
	
	}//main

}//class
