/**
 * CS 110 Section 12
 * Project #1
 */
import java.util.Scanner;
public class Voltage {

final static double POWER= 260;
final static double RR= 10;
final static double VOLTAGE= 120;

	public static void main(String[] args) {
		double pF=0;
		
//Reads Scanner in.
		Scanner in= new Scanner(System.in);
		
//Tells user to enter a power factor.
		System.out.println("Please enter a power factor to calculate the amount of source voltage.");
		
//User enter power factor.
		pF= in.nextDouble();

//Allows for use of static method
		double source=sourceVoltage(pF);
		
//Prints the amount of source voltages
		System.out.println("The amount of source voltage is:" + source + " Vrms");

//Closes Scanner.
		in.close();
		
	}//main
	
	
//Static method that solves for he source voltage
	public static double sourceVoltage(double pF) {
		
		double eq1=Math.pow((VOLTAGE+((2*RR*POWER)/VOLTAGE)), 2);
		double eq2=Math.pow(((2*RR*POWER)/(pF*VOLTAGE)), 2);
		double eq3=(1-(pF*pF));
		double Vs= Math.sqrt(eq1+(eq2*eq3));
		
		return Vs;
	}//sourceVoltage

}//class
