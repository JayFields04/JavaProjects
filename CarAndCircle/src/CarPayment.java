/**
 * CS 110 Section 12
 * Project #2
 */
import java.util.Scanner;

public class CarPayment {

	static double RATE= .069;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in= new Scanner(System.in);
		
		System.out.println("Please enter the make, model, and year of the car.");
			String make= in.next();
			String model=in.next();
			int year=in.nextInt();
			
		System.out.println("Enter the automobiles price and the amount of the down payment");
			double price=in.nextDouble();
			double downPayment= in.nextDouble();
			
		System.out.println("Enter the loan amount");
			double principle= in.nextDouble();
		System.out.println("Enter the number of months for which the automobile is financed");
			int months= in.nextInt();
			
		System.out.println("The make of the car is: "+ make);
		System.out.println("The model of the car is "+ model);
		System.out.println("The price of the car is: "+ price);
		System.out.println("The down payment of the car is: "+ downPayment);
		System.out.println("The loan amount is: "+ principle);
		System.out.printf("\nThe monthly payments .2%f", calculatePayment(principle,months, RATE));
		
		System.out.println("How many payments have been made?");
			int paymentsPerYear=in.nextInt();
		
		
	}//main

	public static int calculatePayment(double principle,int months, double RATE) {
		double pay= (principle* (RATE/12)/(1-(Math.pow(1+RATE/12, months))));
		Math.round(pay);
		int payment=(int)pay;
	return payment;
	}//calculatePayment
	
	
	public static double balanceRemaining(int payment, double month, int PaymentsPerYear) {
		//	double amount = payment*((1-Math.pow((1+RATE/paymentsPerYear), -(numOfPayment*months-paymentsPerYear)));
		return PaymentsPerYear;
	
	
	}
}//class
