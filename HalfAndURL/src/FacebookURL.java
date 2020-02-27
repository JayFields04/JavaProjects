/**
 * CS 110 Section 12
 * Lab #4 Part 2
 */
import java.util.Scanner;

public class FacebookURL {
	public static void main(String[] args) {

//Reads Scanner in.
	Scanner in= new Scanner(System.in);

//Asks user for URL.
		System.out.println("Enter a URL.");

//Allows user to enter URL.
		String url=in.nextLine();

//Gets the position of the slashes and finds hashcode.
		int slash= url.indexOf('/');
		int thirdSlash= url.indexOf('/', slash+2);
		String hashcode= url.substring(thirdSlash+1);

//Prints out the hashcode.
		System.out.println("The hashcode is: " + hashcode);
		
//Closes Scanner.
		in.close();
		
	}//main
	
}//class
