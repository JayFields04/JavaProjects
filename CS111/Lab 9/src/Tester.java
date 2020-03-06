/** 
 * CS 111 Section 2
 * Lab Assignment 9
 * Jaquez Fields
 */
public class Tester {

	public static void main(String[] args) {
		
		Unordered test= new Unordered();

//Unordered list with two different T		
		test.add(11);
		test.add(2);
		test.add(90);
		test.add(4);
		test.add("Hello");
		test.add("Fields");
		test.add("Jay");

//Displays new elements first		
		test.displayForward();
		System.out.println();

//Tells us the size of the list		
		System.out.println("There are: "+test.size()+ " elements in the list");
		System.out.println();
		
//Removes elements from the list		
		test.remove("Hello");
		test.remove(11);
		test.remove(90);
		System.out.println();

//Displays elements with removed elements		
		test.displayForward();
		System.out.println();

		System.out.println("There are: "+test.size()+ " elements in the list");
		
	}//main

}//class
