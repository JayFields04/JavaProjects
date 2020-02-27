/**
 * CS 110 Section 12
 * Lab #9
 */
import java.util.Scanner;

public class checkPalindrome {

//Class that test if word is a palindrome 
	public static boolean isPalindrome(String str){
		if (str.length() <2)
			return true;


		if (str.charAt(0) != str.charAt(str.length() -1))
			return false;


		return isPalindrome(str.substring(1, str.length() -1));
	}//isPalindrome


//Display Palindrome using boolean statements if the requirements are met by isPalindrome
	public static void main(String[] args) {

//Reads Scanner in
		Scanner in= new Scanner(System.in);

//Asks user to enter String
		System.out.println("Enter string to check palindrome.");

//Gets user input		
		String pal= in.next();
		
		System.out.println();

//Booleans statements to decide which will be printed out
		boolean tF= isPalindrome(pal);

		if (tF == true)
		{
			System.out.println(pal + ": is a Palindrome");	
		}

		else 
		{
			System.out.println(pal + ": is not a Palindrome");
		}

		System.out.println();

//Closes Scanner
		in.close();
	}//main


}//class


