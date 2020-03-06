/** 
 * CS 111 Section 2
 * Lab Assignment 10
 * Jaquez Fields
 */

public class Tester {

	public static void main(String[] args) throws QueueEmptyException {
		
		CircularQueue test= new CircularQueue();
	
//Adds elements to circular queue with 2 different T elements
		test.enqueue(11);
		test.enqueue(2);
		test.enqueue(90);
		test.enqueue(4);
		test.enqueue("Hello");
		test.enqueue("Fields");
		test.enqueue("Jay");		
		
//Number of elements
		System.out.println("There are "+test.size()+ " in the list");
		
//Displays the new elements first
		test.display();	
		
//Removes elements
		System.out.println("\n");
		System.out.println("The first two items have been removed");
		test.dequeue();
		test.dequeue();
		
//Number of elements
		System.out.println("There are "+test.size()+ " in the list");		

//looks at the first element in the queue
		System.out.println();
		System.out.println("The first element in the list is "+ test.peek());

//Displays the new elements first
		test.display();	
	
//Further testing for exception method
//		int size= test.size();
//		
//		for(int i=0; i<size+1;i++) {
//			test.dequeue();
//		}//for

		
	}//main

}//class
