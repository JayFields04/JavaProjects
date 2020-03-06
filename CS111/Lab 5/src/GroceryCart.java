/** 
 * CS 111 Section 2
 * Lab Assignment 5
 * Jaquez Fields
 */

import java.util.Scanner;

public class GroceryCart{
	
	public static void main(String[]args) {
		
		Scanner in = new Scanner(System.in);
		
//Asks and gets how many items will be purchased
		System.out.println("How many items will you be buying today?");
		
		int numItems= in.nextInt();

//Creates array with numItems as size		
		String[] names= new String[numItems];
		Double[] prices= new Double[numItems];

//for loop that gets user input on items and prices		
		for(int i=0; i<numItems;i++) {
			
			System.out.println("Enter the name of item "+ (i+1));
			
			in.next();
			names[i]= in.nextLine();
			
			System.out.println("What is the price of this item?");
	
			prices[i]=in.nextDouble();
			
		}//for
				
		AnyArray <String> nameList= new AnyArray(names);
		AnyArray <Double> priceList= new AnyArray(prices);

//Prints info. about nameList/priceList 	
		
		System.out.println(nameList.toString());
		System.out.println(priceList.toString());
			
//Asks user to enter the name of the item and searches for it
		System.out.println("Enter item that you want to search for.");
		
		in.next();
		String search= in.nextLine();
		 

			System.out.println("The price is: "+ priceList.getIth(nameList.findLocation(search)));
		
	}//main
}//class
