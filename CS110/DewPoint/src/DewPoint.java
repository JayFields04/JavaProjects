/**
 * CS 110 Section 12
 * Project #1
 */
import java.util.Scanner;
public class DewPoint {

final static double AA= 17.27;
final static double BB= 237.7;

	public static void main(String[] args) {

//Reads scanner in.
		Scanner in= new Scanner(System.in);
		
//Asks users to enter relative humidity (0-1)	
		System.out.println("Please enter the relative humidity. Between 0 and 1.");
	
//User enter humidity (0-1).	
		float humid= in.nextFloat();
	
//Asks user to enter temperature.
		System.out.println("Enter temperature in degrees Celsius");
	
//User enter temp. in degrees C.	
		double temp=in.nextDouble();
	
//Allows for use of static method
		double dewPoint=dewPointEquation(humid,temp);
	
//Prints the Dew Point
		System.out.println("The dew point is approximately:"+ dewPoint);
	
//Closes Scanner
		in.close();
	}//main
	
//Static method that solves the dewpoint
	private static double dewPointEquation(float humid, double temp) {
		double F= (((AA*temp)/(BB+temp))+ ((Math.log(humid))));
		double dewP= ((BB*F)/(AA-F));
	
		return dewP;
	}//dewPoint

}//class
