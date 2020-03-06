/** 
 * CS 111 Section 2
 * Lab Assignment 12
 * Jaquez Fields
 */

//Iterative 25- 2
//Iterative 50- 3
//Iterative	100- 3

//Recursive 25- 2
//Recursive 50- 2
//Recursive 100- 2

public class GeometricSeries {

	public static void main(String[] args) {

//Measures the execution time of the recursive methods	
		
//		long startTime = System.currentTimeMillis();
//		System.out.println(calculateGeometricSeriesIterative(5,10,25));
//		endTime = System.currentTimeMillis();
//		finalTime = endTime - startTime;
//		System.out.println("Iterative for 5,10,25 was: " + finalTime);		

//		long startTime = System.currentTimeMillis();
//		System.out.println(calculateGeometricSeriesIterative(5,10,50));
//		long endTime = System.currentTimeMillis();
//		long finalTime = endTime - startTime;
//		System.out.println("Iterative for 5,10,50 was: " + finalTime);
		
//		long startTime = System.currentTimeMillis();
//		System.out.println(calculateGeometricSeriesIterative(5,10,100));
//		long endTime = System.currentTimeMillis();
//		long finalTime = endTime - startTime;
//		System.out.println("Iterative for 5,10,100 was " + finalTime);
	
//		long startTime = System.currentTimeMillis();
//		System.out.println(calculateGeometricSeriesRecursive(5,10,25));
//		long endTime = System.currentTimeMillis();
//		long finalTime = endTime - startTime;
//		System.out.println("Recursive for 5,10,25 was: " + finalTime);
		
//		long startTime = System.currentTimeMillis();
//		System.out.println(calculateGeometricSeriesRecursive(5,10,50));
//		long endTime = System.currentTimeMillis();
//		long finalTime = endTime - startTime;
//		System.out.println("Recursive for 5,10,50 was: " + finalTime);

//		long startTime = System.currentTimeMillis();
//		System.out.println(calculateGeometricSeriesRecursive(5,10,100));
//		long endTime = System.currentTimeMillis();
//		long finalTime = endTime - startTime;
//		System.out.println("Recursive for 5,10,100 was:" + finalTime);

	}//main

//Recursive method that calculates the geometric series iteratively
	public static double calculateGeometricSeriesIterative(double a, double r, int n) {
		double total = 0;
			for(int i = 0; i <= n; i ++) {
				total = total + a * (Math.pow(r, i));
		}//for
		return total;
		
	}//calculateGeometricSeriesIterative

	//Recursive method that calculates the geometric series recursively	
	public static double calculateGeometricSeriesRecursive(double a, double r, int n) {
		if(n == 0) {
			return a;
		}//if
		else {
			return a*(Math.pow(r, n)) + calculateGeometricSeriesRecursive(a,r,n-1);
			
		}//else
	}//calculateGeometricSeriesRecursive
}//class
