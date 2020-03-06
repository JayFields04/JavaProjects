/**
 * CS 110 Section 12
 * Lab 10
 */

import java.util.Scanner;
import java.io.*;

public class ExamAverage {
public static void main(String[] args) throws FileNotFoundException{
	
try {
	
		Scanner in= new Scanner(new FileReader("Grades.txt"));
		
		while (in.hasNext()) {
			String firstName= in.next();
			String lastName= in.next();
			double grade1= in.nextDouble();
			double grade2= in.nextDouble();
			double grade3= in.nextDouble();
			
			double average= (grade1+grade2+grade3)/3;
			
			System.out.println(firstName+" "+ lastName+"'s average grade is: "+ average);
			
		}//while
	}
	
	catch(Exception e){
		System.out.println("Error with the file check spelling and try again");
	}
	
	}//main


}//class
