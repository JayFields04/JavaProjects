/**
 * CS 110 Section 12
 * Lab 6 Part 2
 */
import java.util.Scanner;
public class DiscountCalculator {

	public static void main(String[] args) {
				
//Reads scanner in.		
		Scanner in= new Scanner(System.in);
		
//Asks and prompts user for price of shirt and trousers
		System.out.println("Please input the price of the shirt");
		double shirt= in.nextDouble();

		System.out.println("Please input the price of the trousers");
		double trousers= in.nextDouble();
		
//Displays the total price	
	System.out.println("The amount to pay is: "+ calculator(trousers,shirt));
	
//Closes Scanner
	in.close();
	}//main

	
	
//Static method that calculates the discount of the trousers and total
	public static double calculator(double trousers,double shirt) {
		double tDiscount= trousers* .20;
		double tPrice= trousers- tDiscount;
		double tAndShirs= (tPrice+ shirt)* .05;
		double total= (tPrice+ shirt)-tAndShirs;
		return total;
	}//pantsDiscount

}//class
