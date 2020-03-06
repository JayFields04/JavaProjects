import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		
		Scanner in= new Scanner(System.in);
		int userChoice, num1, num2;
		
		displayMenu();
		userChoice=in.nextInt();
				
		while(userChoice!=5) {
			
			if(userChoice==1) {
				System.out.println("Enter two numbers");
				num1=in.nextInt();
				num2=in.nextInt();
				System.out.println("Sum:"+addition(num1,num2)+"\n");
			}//if
			
			else if(userChoice==2) {
				System.out.println("Enter two numbers");
				num1=in.nextInt();
				num2=in.nextInt();
				
				System.out.println("Sum:"+subtraction(num1,num2)+"\n");
			}//else if
			
			else if(userChoice==3) {
				System.out.println("Enter two numbers");
				num1=in.nextInt();
				num2=in.nextInt();
				
				System.out.println("Sum:" +multiplication(num1, num2)+"\n");
			}//else if
			
			else if(userChoice==4){
				System.out.println("Enter two numbers");
				num1=in.nextInt();
				num2=in.nextInt();
				
				System.out.println("Sum:"+division(num1, num2)+"\n");
			}//else if
			
			else {
				System.out.println("You entered invalid number\n");
			}//else

			displayMenu();
			userChoice=in.nextInt();
		}//while
		
		in.close();
	}//main
	
//!Displays calculator options	
	public static void displayMenu() {
		System.out.println("1. Addition\n2. Subtraction\n3. Multiplication\n4. Division\n5. Exit");
	}//menu

//!Adds two numbers
	public static int addition(int a, int b) {
		int sum;
		sum =(a+b);
		return sum;
	}//addition

//!Subtracts two numbers
	public static int subtraction(int a ,int b) {
		int sum; 
		sum= (a-b);
		return sum;
	}//subtraction
	
//Multiplies two numbers
	public static int multiplication(int a, int b) {
		int sum;
		sum= (a*b);
		return sum;
	}//multiplication

//!Divides two numbers(does not take into account dividing by zero)
	public static int division(int a, int b) {
		int sum;
		sum= (a/b);
		return sum;
	}//division

}//Calculator
