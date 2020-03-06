/** 
 * CS 111 Section 2
 * Lab Assignment 2
 * Jaquez Fields
 */

import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.FileReader;


public class WordPuzzle {
	
	static char[][]puzzle;
	
	public static void main(String []args) throws FileNotFoundException {
		
		puzzle= fill(puzzle);
		printPuzzle(puzzle);
		Scanner in = new Scanner(System.in);
		System.out.println("Type word to search for it");
		String word= in.nextLine();
		in.close();
		
		play(word,puzzle);

	}//main
	
//Create and returns 2D array.
	public static char[][]fill(char[][]puzzle) throws FileNotFoundException {
		Scanner in2= new Scanner(System.in);
		System.out.println("Enter file name.");
		String fname= in2.nextLine();
		
		Scanner readFile= new Scanner(new FileReader(fname));
		
		int row= readFile.nextInt();
		int col=readFile.nextInt();
		puzzle=new char[row][col];
		
		for (int i=0; i<row;i++) {
			for(int j=0;j<col;j++) {
				String store=readFile.next();
				puzzle[i][j]=store.charAt(0);
			}//for
		}//for
		
		return puzzle;
	}//char
	
//Displays the puzzle	
	public static void printPuzzle(char[][]puzzle) {
	    for(int row = 0; row < puzzle.length; row++){
	        for(int col = 0; col < puzzle[row].length; col++){
	            System.out.print("["+puzzle[row][col] + "]");
	        }//for
	        System.out.println();
	    }//for		
	    
	}//printPuzzle
	

	
//*Check to the right for word given by user	
	public static boolean checkDown(char[][] puzzle, String word, int row, int col){
		return false;
	}//checkDown

//Check below for word	
		public static boolean checkRight(char[][] puzzle, String word, int row, int col) {
			
			boolean findLetter = true;
			int nextLetter = 1;
			if(col != puzzle[0].length){
				
				for(int p = col + 1; p < puzzle[0].length && findLetter == true && nextLetter < word.length(); p++){ 
					
					if(puzzle[row][p] == word.charAt(nextLetter)){
						findLetter = true;
						nextLetter++;
						
					}//if
					
					else{
						findLetter = false;
						
					}//else
				}//for
				
			}//if
			
			if(findLetter == true && nextLetter == word.length()){
				return true;
				
			}//if
			
			else{
				return false;
				
			}//else
		}//checkDown

//Plays the game and uses chckDown and checkRight methods
		public static void play(String word, char[][]puzzle){
			
			char findWord = word.charAt(0);
			
			int row = 0;
			int col = 0;
			boolean trueFalse = false;
			

			for(int n = 0; n < puzzle.length; n++){
				for(int k = 0; k < puzzle[0].length; k++){           
					if(puzzle[n][k] == findWord){
						
						row = n;
						col = k;
						
						
						if(checkRight(puzzle, word, row, col) == true){
							int finalRow= row+1;
							int finalCol= col+1;
							System.out.println(word+ " was wound in cell ["+finalRow+"]["+finalCol+"]");
							trueFalse = true;
						}//if
					}//if
					
				}//for
			}//for
			
			
			
			if(trueFalse == false){
				System.out.println("The word " + word + " was not found in the puzzle.");
			}//if
			
		}//play
		
}//class
