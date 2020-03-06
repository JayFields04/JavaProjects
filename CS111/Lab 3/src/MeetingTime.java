/** 
 * CS 111 Section 2
 * Lab Assignment 3
 * Jaquez Fields
 */
import java.util.Scanner;

public class MeetingTime {

	public static void main (String []args) {
		
		Clock myTime= new Clock(11,00);
		
		Scanner in= new Scanner(System.in);	
		System.out.println("Enter your time of arrival. First enter hours and then minutes.");
			int hours= in.nextInt();
			int minutes=in.nextInt();
			
//try and catch blocks to catch if user input is valid or not
		try {
				
				if (hours>24||hours<0) {
				throw new IllegalArgumentException("You entered invalid value of hours");
				
			}//if			
		}//try
		
		catch(IllegalArgumentException i){
			System.out.println("Please re-enter hours");
			in.nextInt();
		}//catch
		
		try {
			if (minutes>60||minutes<0) {
				throw new IllegalArgumentException("You entered invalid value of minutes.");
			}//if
			
		}//try
		
		catch(IllegalArgumentException i){
			System.out.println("Please re-enter minutes.");
			 in.nextInt();
		}//catch

//creates object for for user values
		Clock friendTime= new Clock(hours,minutes);
		
		
		System.out.println("Your time of arrival is "+ friendTime.toString());

//compares friendTime and myTime and displays message
		if (myTime.compareTo(friendTime)==0) {
			System.out.println("We are going to arrive at the same time.");
			
		}//if
		else if(myTime.compareTo(friendTime)>0) {
			System.out.println("Looks like you are going to there earlier than me.");
		}
		else {
			System.out.println("It looks like I will be there earlier than you.");
		}
		
		
		
	}//main
}//class
