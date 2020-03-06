/** 
 * CS 111 Section 2
 * Lab Assignment 1
 * Jaquez Fields
 */

public class Shapes {

//Draws the circle
	public static void drawCircle(double r) {
		StdDraw.circle(0, 0, r);
	}//drawCircle

//Finds the area of the circle
	public static void computeAreaCircle(double r) {
		double area= Math.PI* Math.sqrt(r);
		System.out.println("The area is: "+ area);
	}//computeAreaCirlce
	
//Draws the square	
	public static void drawSquare(double s) {
		StdDraw.square(0, 0, .5*s);
	}//drawSquare
	
//Finds the area of the square	
	public static void computeAreaSquare(double s) {
		double area= Math.pow(s,2);
		System.out.println("The area is: "+ area);
	}//computeAreaSquare

//Draws rectangle
	public static void drawRectangle(double h, double w) {
		StdDraw.rectangle(0, 0, w, h);
	}//drawRectangle

//Finds the are of rectangle
	public static void computeAreaRectangle(double h, double w) {
		double area= (h*w);
		System.out.println("The area is: "+ area);
	}//computeAreaRectangle
	
}//class
