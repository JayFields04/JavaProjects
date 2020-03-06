/**
 * CS 110 Section 12
 * Lab 6 Part 1
 */
import java.util.Scanner;
public class SwapValues {

	public static void main(String[] args) {
		
//Reads scanner in.		
		Scanner in= new Scanner(System.in);

//Asks numbers and allows the user to have input
		System.out.println("Enter value of variable 1");
			int val1=in.nextInt();
		System.out.println("Eneter value of variable 2");
			int val2=in.nextInt();
			
			
//invoking the non static method
		SwapValues dm= new SwapValues();
		dm.swapFunction(val1, val2);
		
//Closes Scanner
		in.close();
	}//main


//Non Static method to switch the values
	public void swapFunction(int val1,int val2) {
		int a= val1;
		int b= val2;
		
		System.out.println("After swapping value of varible 1 is:"+ b
				+ " and  varrible 2 is: "+ a);
	}//swapFunction
}//class
