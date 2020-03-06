/** 
 * CS 111 Section 2
 * Lab Assignment 7
 * Jaquez Fields
 */

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class AssemblyLine {

	public static void main(String[] args) {	
		
		Scanner in= new Scanner(System.in);
		Queue<String> assembly= new LinkedList<String>();
		
		System.out.println("Press 1 to add tires \nPress 2 to add radio \nPress 3 to add windows");
		System.out.println("Press 4 to add brake \nPress 5 to add seats \nPress 6 to remove the front element from the assembly line");
		System.out.println("Press 7 to display the item on the assembly line \nPress 8 to flip the order of items on the assembly line");
		System.out.println("Press 9 to remove all 'breaks' from the assembly line \nPress 0 to stop the assembly line and go home!");
		
		int choice= in.nextInt();
		
		while(choice!=0){

//Uses switch statements to decide which action to do.
//#1-5 just add elements into the queue
			switch (choice) {
				case 1: 
					assembly.add("Tire");
					System.out.println("Tire added!");
				break;
				
				case 2:
					assembly.add("Radio");
					System.out.println("Radio added!");
					break;
					
				case 3:
					assembly.add("Window");
					System.out.println("Window added!");
					break;
					
				case 4:
					assembly.add("Brakes");
					System.out.println("Brakes added!");
					break;
					
				case 5:
					assembly.add("Seat");
					System.out.println("Seats added!");
					break;

//.poll() specificly removes the first element in queue					
				case 6:
					assembly.poll();
					System.out.println("Front element removed");
					break;
					
//Prints all elements in the assembly line using String 					
				case 7:
					System.out.println("The current items in the assembly line:");
					
					for(String str: assembly) {
						System.out.print(str+ " ");
					}//for

					break;
					
//Revering the queue by using stack	
				case 8:
					System.out.println("Assembly line reversed");
					
					Stack <String>st= new Stack<String>();
					
//When the queue is not empty it add elements into the stack					
					while(!assembly.isEmpty()) {
						st.push(assembly.poll());
					}//while
					
//Then the stack puts elements back into the queue					
					while(!st.isEmpty()) {
						assembly.add(st.pop());
					}//while

					break;

//Removes all elements in the assembly line if it contains the word "brakes"					
				case 9:
					System.out.println("All brakes have been removed from the assembly line");
					
					while(assembly.contains("Brakes")) {
						assembly.remove("Brakes");
					}

					break;

//If numbers other than 0-9 are put it will prompt this					
				default:System.out.println("Enter a valid number"); break;
					
			}//switch
			choice= in.nextInt();
			
		}//while
	
//When choice is 0 it will close the program		
		while(choice==0) {
			System.out.println("Assembly line has stopped!");
			System.exit(0);
		}//while
		
		in.close();
		
	}//main

}//class
