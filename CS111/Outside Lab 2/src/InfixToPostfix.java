/** 
 * CS 111 Section 2
 * Outside Lab 2
 * Jaquez Fields
 */

import java.util.Scanner;
import java.util.Stack;

public class InfixToPostfix {

	public static void main(String[] args) {
		
		Scanner in= new Scanner(System.in);
		
		System.out.println("Enter infix to convert it to postfix");
		
		String infix= in.nextLine();
		
		try {
		System.out.println(convertToPostfix(infix));
		}//try
		
	catch (MissingOperatorException ex) {
		System.out.println("Missing operator");
	}//catch
	
	catch (MissingOperandException ex) {
		System.out.println("Missing operand");
	}//catch
	
	catch (MissingParenthesesException ex) {
		System.out.println("Missing parentheses error!");
	}//catch
				
	}//main
	
//infix to postfix algorithm in book
	public static String convertToPostfix(String infix) throws MissingOperandException, MissingOperatorException, MissingParenthesesException{
		
		Stack<String> operatorStack = new Stack<String>();
		String postfix = "";
		char nextChar;
		String topOp;
		char lastChar = ' ';
		
		if(infix.contains("(")&& !infix.contains(")")) {
			throw new MissingParenthesesException();
			
		}//if
		
		
		for(int i =0; i < infix.length(); i++) {
			nextChar = infix.charAt(i);

			switch (nextChar) {

			case ' ':
				break;

			case  '+' : case '-' : case '*': case '/': 
				
				while(!operatorStack.isEmpty() && !precedence(operatorStack.peek().charAt(0), nextChar)) {
					postfix = postfix + operatorStack.peek();
					operatorStack.pop();
				}//while
				
				operatorStack.push(Character.toString(nextChar));
				
				break;
				
			case '(' : 
				operatorStack.push(Character.toString(nextChar));
				break;
				
			case ')' : 
				topOp = operatorStack.pop();
				
				while(!topOp.equals("(")) {
					postfix = postfix + topOp;
					topOp = operatorStack.pop();
					
				}//while
				
				break;
				
				default: 
					postfix = postfix + nextChar;
					break;
		
			}//switch
			
		}//for
		
		while(!operatorStack.isEmpty()) {
			topOp = operatorStack.pop();
			postfix = postfix + topOp;
		}//while
		
		return postfix;
	}//
	
//Precedence of operators	
	public static boolean precedence(char op1, char op2) {
		
		int val1;
		int val2;
		
		if(op1 == '+' || op1 == '-') {
			val1 = 1;
		}//if
		
		else if(op1 == '*' || op1 == '/'){
			val1 = 2;
		}//else if
		
		else {
			val1 = 3;
		}//else
		
		if(op1 == '+' || op1 == '-') {
			val2 = 1;
		}//if
		
		else if(op1 == '*' || op1 == '/'){
			val2 = 2;
		}//else if
		
		else {
			val2 = 3;
		}//else
		
		if(val1 >= val2) {
			return true;	
		}//if
		
		else {
			return false;	
		}//else
		
	}//precedence

}//class
