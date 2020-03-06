/** 
 * CS 111 Section 2
 * Lab Assignment 9
 * Jaquez Fields
 */

public class Unordered <T> {

//Node class
	private static class Node<T> {
		private T data;
		private Node<T> next;
		private Node (T d){
			data = d;
			next = null;
		}//Node1
		
		private Node (T d, Node<T> ref){
			data = d;
			next = ref;
		}//Node2
	}//Node3
	
	
//Stores the fist element	
		private Node<T> head;
//Stores the size	
		private int numEle;

//Default con. that sets heat to null and numEle to 0		
		public Unordered(){
			head= null;
			numEle= 0;
		}//Default Constructor

//Adds and element to the front of the list		
		public void add(T value) {
			Node<T> temp= new Node(value);
			temp.next=head;
			head=temp;
			numEle++;
			
		}//add

//Removes the element "value" from the list		
		public void remove(T value) {
			Node<T> temp= head;
			Node<T>back= null;
			
			while(!(temp==null)&&!(temp.data.equals(value))) {
				back=temp;
				temp=temp.next;
			}//while
			
			if(temp==null||numEle==0) {
				
				System.out.println("List is empty or no list exist");
			}//if
			
			else {
				back.next=temp.next;
				
				System.out.println(value+ " :was removed from the list");
				
				numEle--;
			}//else
		}//remove
		
//Displays the list from the front		
		public void displayForward() {
			Node<T>temp= head;
			while(temp!=null) {
				System.out.print(temp.data+ " ");
				temp=temp.next;
			}//while
		}//display

//Return the number of elements in the list		
		public int size() {
			
			return numEle;
		}//size
		
}//class
