/** 
 * CS 111 Section 2
 * Lab Assignment 1
 * Jaquez Fields
 */

import java.util.Scanner;

public class DrawShapes {

	public static void main(String[] args) {

//Reads Scanner in.
		Scanner in= new Scanner(System.in);

//Set scale for X and Y
		StdDraw.setXscale(-10,10);
		StdDraw.setYscale(-10,10);

//Asks users choice 		
			System.out.println("What shape do you want to plot? Circle Square,"
								+ " or Rectangle? Enter Quit to exit.");
			
//Gets user input			
			String choice=in.nextLine();
			

//While loop from the choice selected that are not quit
	while(!choice.equalsIgnoreCase("quit")) {
			
			if(choice.equalsIgnoreCase("circle")) {
				System.out.println("What is the radius?");
				double r=in.nextDouble();
				in.nextLine();
					Shapes.drawCircle(r);
					Shapes.computeAreaCircle(r);
				
			}//if
			
			else if(choice.equalsIgnoreCase("square")) {
				System.out.println("What is the length of one side?");
				double s= in.nextDouble();
				in.nextLine();
					Shapes.drawSquare(s);
					Shapes.computeAreaSquare(s);
					
					
			}//if

			else if(choice.equalsIgnoreCase("rectangle")) {
				System.out.println("What is the heigth?");
				double h= in.nextDouble();
				System.out.println("what is the width?");
				double w=in.nextDouble();
				in.nextLine();
					Shapes.drawRectangle(h, w);
					Shapes.computeAreaRectangle(h, w);
				
			}//if
			
//If none of them are selected gives menu option again			
			else {
				
//Asks users choice 		
				System.out.println("What shape do you want to plot? Circle Square,"
									+ " or Rectangle? Enter Quit to exit.");
//Gets user input			
				
				
			}//else
			System.out.println("What shape do you want to plot? Circle Square,"
					+ " or Rectangle? Enter Quit to exit.");
			choice=in.nextLine();
		}//while

//While choice is quit, it closes the program		
		while(choice.equalsIgnoreCase("quit")) {
			System.out.println("Program closed");
			System.exit(0);
		}
		
	}//main

}//class
