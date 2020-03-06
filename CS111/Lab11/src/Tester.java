/** 
 * CS 111 Section 2
 * Lab Assignment 11
 * Jaquez Fields
 */

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyArrayList test= new MyArrayList();
		
		test.add(9);
		test.add(1);
		test.add(7);
		test.add(4);
		test.add("Hi");		
		
		System.out.println(test.size()+ ":items are on the list");
		
		if(test.full()==true) {
			System.out.println("The list is full");
		}//if
		
		else {
			System.out.println("There is room to add more elements to the list");
		}//else
		
		test.display();
		
		test.remove("Hi");
		System.out.println();
		test.display();
		
		test.clear();
		System.out.println();
		
		if(test.empty()==true) {
			System.out.println("The list is empty");
		}//if
		else {
			System.out.println("There are elements in the list");
		}//else
		test.display();
		
		test.add("Hello");
		test.add("My");
		test.add("Name");
		test.add("is");
		test.add("Jaquez");
		
		test.display();
		
		test.remove("is");
		
		
	}//main

}//class
