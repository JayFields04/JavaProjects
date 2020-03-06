/**
 * CS 110 Section 12
 * Project #2
 */
import java.util.Scanner;

public class Circles {

	public static void main(String[] args) {
		
double x1,x2,y1,y2;

//Reads Scanner in
		Scanner in= new Scanner(System.in);
		
//Asks and gets user input
		System.out.println("Please enter the X1 coordinate for the center of the circle");
		System.out.println("Please enter the Y1 coordinate for the center of the circle");
			x1=in.nextDouble();
			y1=in.nextDouble();
			
		System.out.println("Please enter the X2 coordinate on a point of the circle");
		System.out.println("Please enter the Y2 coordinate on a point on the circle");
			x2=in.nextDouble();
			y2=in.nextDouble();

			System.out.printf("The distance between the given points are: %.2f", distanceFormula(x1,x2,y1,y2));
			System.out.printf("\nThe radius of the circle is: %.2f",radiusFinder(x1,x2,y1,y2));
			System.out.printf("\nThe diameter of the circle is: %.2f",diameterFinder(radiusFinder(x1,x2,y1,y2)));
			System.out.printf("\nThe circumference of a the circle is: %.2f", circumferenceFormula(radiusFinder(x1,x2,y1,y2)));
			System.out.printf("\nThe area of the circle is: %.2f", areaFormula(radiusFinder(x1,x2,y1,y2)));

//Checks if if is equal to all printf values			
			//System.out.println("The distance between the given points are:"+ distanceFormula(x1,x2,y1,y2));
			//System.out.println("The radius of the circle is:"+radiusFinder(x1,x2,y1,y2));
			//System.out.println("The diameter of the circle is:"+diameterFinder(radiusFinder(x1,x2,y1,y2)));
			//System.out.println("The circumference of a the circle is:"+ circumferenceFormula(radiusFinder(x1,x2,y1,y2)));
			//System.out.println("The area of the circle is:"+ areaFormula(radiusFinder(x1,x2,y1,y2)));

	}//main

//Method that finds the distance formula
	public static double distanceFormula(double x1,double y1, double x2, double y2) {
		double xSquared= Math.pow(x2-x1,2);
		double ySquared= Math.pow(y2-y1,2);
		double distance=Math.sqrt(xSquared+ySquared);
		return distance;
	}//distanceFormula

	
//Method that fids the radius. Which is equal to the distance(center to the oteher coordiante
	public static double radiusFinder(double x1,double y1, double x2, double y2) {
		double xSquared= Math.pow(x2-x1,2);
		double ySquared= Math.pow(y2-y1,2);
		double radius=Math.sqrt(xSquared+ySquared);
		return radius;
	}//radiusFinder

	
//Method that finds the diameter
	public static double diameterFinder(double radius) {
		double diameter= 2*radius;
		return diameter;
	}//diameterFinder

	
//Method that finds the circumference
	public static double circumferenceFormula(double radius) {
		double circumference= 2* Math.PI*radius;
		return circumference;
	}//circumferenceFormula
	

//Method that finds the area of a circle	
	public static double areaFormula(double radius) {
		double area= Math.PI*Math.pow(radius, 2);
		return area;
	}//areaFormula
	

}//class
