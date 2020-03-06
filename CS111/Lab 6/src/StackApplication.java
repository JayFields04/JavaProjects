/** 
 * CS 111 Section 2
 * Lab Assignment 6
 * Jaquez Fields
 */

import java.util.Scanner;
import java.util.Stack;

public class StackApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in= new Scanner(System.in);

		System.out.println("Enter 1 to evaluate a prefix expression\n"
				+ "Enter 2 to evaluate a postfix expression");

		int choice= Integer.parseInt(in.nextLine());

		System.out.println("Enter the expression");
		String eval=in.nextLine(); 

		in.close();
		if(choice==1) {
			evalPrefix(eval);
		}//if
		else {
			evalPostfix(eval);
		}//else



	}//main
	
//Evaluates postfix expression
	public static void evalPostfix(String expression) {

		Stack<Integer> valueStack = new Stack<Integer> ();
		Scanner in = new Scanner(expression);

//Reads if there are elements in scanner		
		while (in.hasNext()) {

//if elements in scanner are numbers it pushes it to stack			
			if (in.hasNextInt()) {
				valueStack.push(in.nextInt());
				
			}//if
			
			else {

//removes the top two elements in stack				
				int b = valueStack.pop();
				int a = valueStack.pop();

//Gets the operators 				
				String mathOperand = in.next();

//given the operater is +-/* the elements				
				if (mathOperand.equals("+")) {
					valueStack.push(a + b);
					
				}//else if
				
				else if (mathOperand.equals("-")) {
					valueStack.push(a - b);

				}//else if
				else if (mathOperand.equals("*")) {
					valueStack.push(a * b);
					
				}//else if

				else {
					valueStack.push(a/b);
					
				}//else if
			
			}//else
			
		}//while

		System.out.println(valueStack.pop());		

	}//post

	
//Evaluates prefix expression
	public static void evalPrefix(String expression) {
		
//reverses the string making it possible to read from left to right
		String reverse= "";
		for (int i= expression.length()-1;i>=0;i--) {
			reverse= reverse + expression.charAt(i);
		
		}//for

//evaluates using the postfix method but with the reversed string		
			evalPostfix(reverse);
			
	}//pre


}//class
