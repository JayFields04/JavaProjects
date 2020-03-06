/** 
 * CS 111 Section 2
 * Lab Assignment 10
 * Jaquez Fields
 */

public class CircularQueue <T>{
	
	private static class Node<T> {
		private T data;
		private Node<T> next; 

		private Node (T d){ 
			data = d;     next = null;  } 

		private Node (T d, Node<T> ref){  
			data = d;     next = ref;  
		} //Node   
	}//Node
	
//Private data members	
	private Node<T>tail;
	private int numEle;
	
//Default Constructor	
	public CircularQueue() {
		tail= null;
		numEle=0;
	}//CircularQueue

//Adds elements to the end of the queue	
	public void enqueue(T value) {
		Node newNode= new Node(value);
		
		if(tail==null) {
			tail=newNode;
			tail.next=tail;
		}//if
		
		else {
			newNode.next= tail.next;
			tail.next= newNode;
			tail= newNode;
		}//else
		
		numEle++;
		
	}//enqueue
	
//Removes the element from the beginning	
	public void dequeue() throws QueueEmptyException{
		if(tail==null) {
			throw new QueueEmptyException("Queue is empty");
		}//if
		
		else if( numEle== 1) {
			tail= null;
			numEle=0;
		}//else if
		
		else {
			Node head= tail.next;
			tail.next= head.next;
			head.next= null;
			numEle--;
		}//else
	}//dequeue

//Shows the queue without removing elements	
	public void display() {
		Node <T> temp= tail.next;
		for(int i=0; i<numEle; i++) {
			System.out.print(temp.data+ " ");
			temp=temp.next;
		}//for
		
	}//display

//Returns fist element without removing it	
	public T peek() {
		return tail.next.data;
	}//peek
	
//Returns number of elements in the list	
	public int size() {
		return numEle;
	}//size
}//class
