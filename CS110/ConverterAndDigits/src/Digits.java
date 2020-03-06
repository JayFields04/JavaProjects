/**
 * CS 110 Section 12
 * Lab #3 Part 2
 */
import java.util.Scanner;
import java.lang.String;
public class Digits {

	public static void main(String[] args) {

//Reads Scanner in.
		Scanner in=new Scanner(System.in);
		
//Asks user to enter a 6 digit number.
		System.out.println("Enter a 6-digit number");

//User inputs a number.
		int digits= in.nextInt();

//Convert int to string.
		String sDigit = String.valueOf(digits);

//Makes 6 digits separate using substring.
		String str1= sDigit.substring(0, 1);
		String str2= sDigit.substring(1,2);
		String str3= sDigit.substring(2,3);
		String str4= sDigit.substring(3,4);
		String str5= sDigit.substring(4,5);
		String str6= sDigit.substring(5,6);
		
//Displays number in separate form.
		System.out.println("Digits in the given number are: \n"+str1+"\n"+ str2+"\n"+ str3+"\n"+ str4+"\n"+ str5+"\n"+ str6);
	
		in.close();
	}//main

}//class
