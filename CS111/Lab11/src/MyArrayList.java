/** 
 * CS 111 Section 2
 * Lab Assignment 11
 * Jaquez Fields
 */
public class MyArrayList<T> {

	Object[]arr;
	int index;
	private static final int maxSize=5;
	
	public MyArrayList() {
		index=0;
		arr= (T[])new Object[maxSize];
	}//MyArrayList
	
	public MyArrayList(int size_input) {
		arr=new Object[size_input];
		index=0;
	}//MyArrayList

//shows the elements in the list	
	public void display() {
		for(int i=0;i<index;i++) {
			System.out.print(arr[i]+ " ");
		}//for
	}//display

//checks if the list is empty	
	public boolean empty(){
		if(index==0) {
			return true;
		}//if
		else {
			return false;
		}//else
	}//empty
	
//removes elements from the list	
	public void remove(T value) {
		for(int i=0;i<index;i++) {
			if(arr[i].equals(value)) {
				--index;
				arr[i]=arr[index];
			}//if
		}//for
	}//remove

//add elements to the list	
	public void add(T item) {
		if(index<maxSize) {
			arr[index]=item;
			index++;
		}//if
	}//add

//clears the list	
	public void clear() {
		index=0;
	}//clear

//checks if the list is full	
	public boolean full() {
		if(arr.length==index) {
			return true;
		}//if
		else {
			return false;
		}
	}//full

//returns the size of the list	
	public int size() {
		return index;
	}//size
	
}//class
