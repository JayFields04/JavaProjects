/** 
 * CS 111 Section 2
 * Lab Assignment 12
 * Jaquez Fields
 */ 

public class ArrayRecursion {

	public static void main(String[] args) {
//3 arrays that use the methods below		
		int input[]= {4,2,3,9,4, 2,6,89,12,11};
			printElements(input);
			System.out.println("\nThere are "+ countElements(input, 0)+ " numbers divisible by 3");
			System.out.println();
			
		int input2[]= {7,4,8,34,71, 103,24,99};
			printElements(input2);
			System.out.println("\nThere are "+ countElements(input2, 0)+ " numbers divisible by 3");
			System.out.println();
			
		int input3[]= {1,2,4,5,7,8,10,13,};
			printElements(input3);
			System.out.println("\nThere are "+ countElements(input3, 0)+ " numbers divisible by 3");
		
	}//main

//recursive method that finds if an element in the array is divisible by 3	
	public static int countElements(int[]array, int position) {

			if(position==array.length-1) {
				if(array[position]%3==0) {
					return 1;
				}//if
				else {
					return 0;
				}//else
		}//if
			else {
				if(array[position]%3==0) {
					return 1+ countElements(array,position+1);
				}//if
				
				else {
					return 0+countElements(array, position+1);
				
				}//else
			}//else			
	}//countElements
	
//Prints all elemtns in the array	
	public static void printElements(int[]array) {
		for(int i=0;i<array.length;i++) {
			System.out.print(" "+ array[i]);
		}//for
		
	}//printElements
}//class
