/** 
 * CS 111 Section 2
 * Lab Assignment 8
 * Jaquez Fields
 */

import java.util.ArrayList;
import java.util.Scanner;

public class BankTeller {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		ArrayList<ArrayList<Integer>> db= new ArrayList();
		
		System.out.println("Enter 1 for adding a new customer. \nEnter 2 for recording payment by an existing customer"
							+ " \nEnter 3 to display the database. \nEnter 4 to exit");
		
		int choice= in.nextInt();
		
		while (choice!=4) {
			
			switch (choice) {
			
			case 1:		
		
//Creates temp to store info about the customer				
				//ArrayList<Integer> temp=new ArrayList();
				
//Adds new customer	into a row		
				db.add(new ArrayList());
				
//Gets the current number of rows and last index number we use				
				int numRows=db.size();
				int row=numRows -1;
				
//Asks loan amount				
				System.out.println("Enter approved loan amount");

//Stores loan amount				
				Integer loanAmount= in.nextInt();
				//temp.add(loanAmount);
				
//Adds loanAmount into a its position	
				db.get(row).add(loanAmount);
						
				break;
				
			case 2:

//Gets the current number of rows and last index number we use again				
				numRows= db.size();
				row= numRows-1;

//Stores paid amount				
				Integer paidAmount;

//Asks for customer ID				
				System.out.println("Enter the customer ID");
				
				int customerID= in.nextInt();

//checks if customer ID is valid	
				if(customerID<=row&& customerID>=0) {
					System.out.println("Amount that you want to pay");
					
					paidAmount=in.nextInt();

//Adds paidAmount to the ArrayList 					
					db.get(customerID).add(paidAmount);

//Gets the amount left					
					Integer amountLeft=db.get(customerID).get(0)-db.get(customerID).get(1);

//Adds amount left to the arraylist					
					db.get(customerID).add(amountLeft);

//If amountLeft is zero it prints message					
					if(amountLeft==0) {
						System.out.println("You have fully paid back the loan");
					}//if
					
					else {
						System.out.println("Payment processed! You have $"+ amountLeft+ " remaining");
					}//else
				}//if
				
//If ID is not found prints this message				
				else {
					System.out.println("Customer ID does not exist");
					break;
				}//else	
				break;

//Prints the ArrayList				
			case 3:
				int count =0;
				for(int i=0; i<db.size(); i++) {
					System.out.print("Customer: "+count+" ");
					
					for(int j=0;j<db.get(i).size();j++) {
						System.out.print("The loan amount is , the amount paid is, and the amount left is: $"+ db.get(i).get(j)+ "\n");
						System.out.println(" ");
					}//for
				count++;
				}//for
				break;

//Prints this if number isn't valid				
			default:
				System.out.println("Not a option! Please enter a valid number");
				break;
			
			}//switch
			
			System.out.println("Enter 1 for adding a new customer. \nEnter 2 for recording payment by an existing customer"
								+ " \nEnter 3 to display the database. \nEnter 4 to exit");
			choice=in.nextInt();
		}//while

//Quits when 4 is entered		
		while (choice==4) {
			System.out.println("Exiting!");
			System.exit(0);
		}//while

	}//main

}//class
