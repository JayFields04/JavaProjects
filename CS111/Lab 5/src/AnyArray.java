/** 
 * CS 111 Section 2
 * Lab Assignment 5
 * Jaquez Fields
 */

import java.util.Arrays;

public class AnyArray <T>{
	
	private T[] arr;
	private int size;

//Default Con. 
	public AnyArray() {
		arr= null;
		size= 0;
	}//AnyArray

//Constructor that sets array and size
	public AnyArray(T[]input) {
		arr= input;
		size= input.length;
	}//AnyArray

//return the i-th element in an array	
	public T getIth(int i) {
			return arr[i];
	}//getIth

//checks elements in array and return the location	
	public int findLocation(T query) {
		int location= -1;
		
		for(int i=0;i<size;i++) {
			if(arr[i].equals(query)) {
				location=i;
			}
		}
		return location;
	}//findLocation

//Prints elements in array	
	public void printArray() {
		System.out.println(Arrays.toString(arr)+"\n");
	}//printArray
	
	public String toString() {
		return "This list has: "+ size + " elements with the first item: "+ arr[0].toString()+ 
				" and the last item being: "+ arr[size-1].toString();
	}//toString
}//AnArray
