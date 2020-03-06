package core;

import adt.Response;
import adt.Row;
import adt.Table;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;

/** 
 * This class implements an interactive console
 * for a database server.
 * 
 * Finish implementing the required features
 * but do not modify the protocols.
 */
public class Console {
	/**
	 * This is the entry point for running the
	 * console as a stand-alone program.
	 */
	public static void main(String[] args) {
		prompt(new Server(), System.in, System.out);
	}//main
	
	public static void prompt (Server server, InputStream in_stream, OutputStream out_stream) {
		final Scanner in = new Scanner(in_stream);
		final PrintStream out = new PrintStream(out_stream);
		
		/*
		 * TODO: Use a REPL to prompt the user for inputs,
		 * and send each input to the server for parsing.
		 * No inputs are to be parsed in the console, except
		 * for the case-insensitive sentinel EXIT, which
		 * terminates the console.
		*/
		out.print(">> ");
		String text = in.nextLine();
		
		while(!text.equalsIgnoreCase("exit")) {
		
		List<Response> responses = server.interpret(text);
		
		/*
		 * TODO: This wrongly assumes that there is only
		 * one response from the server. However, there 
		 * may be one or more responses, and each response
		 * should be reported in the order listed.
		 */
		for(int i=0;i<responses.size();i++) {
//			out.println("Success: " + responses.get(i).get("success"));
//			out.println("Message: " + responses.get(i).get("message"));
//			out.println("Table:   " + responses.get(i).get("table"));
			if(responses.get(i).get("success").equals(false)) {
				System.out.println(responses.get(i).get("message"));
			}
			else {
			Table responseTable=(Table) responses.get(i).get("table");
			List<String>names= (List<String>) responseTable.getSchema().get("column_names");
			List<String>types= (List<String>) responseTable.getSchema().get("column_types");
			int colSize=15;
			Object temp;
			
//				System.out.print("____________________________________________________\n");
//				System.out.print("|   String      ||   Integer    ||      Boolean     |\n");
//				System.out.print("|     ps        ||      i       ||          b       |\n");
//				System.out.print("|---------------||--------------||------------------|");
//				System.out.println();
			
			System.out.println();
			for(int s=0;s<types.size();s++) {
				System.out.print(types.get(s));
			}//for	
			System.out.println();
			
			for(int w=0;w<names.size();w++) {
				System.out.print(names.get(w));
			}//for
			

			
			System.out.println();
				for (Row r:responseTable.values()) {
					
					for(int j=0; j<r.size();j++) {
						temp= r.get(j);
		
//String					
					if(types.get(j).equalsIgnoreCase("string")) {
						
						if(((String) r.get(j)).length()>=colSize) {
							temp=((String) temp).substring(0,13);
							System.out.println(temp+"...");
						}//if
						
						else {
							while(((String) temp).length()<colSize) {
								temp=((String) temp).concat(" ");
							}//while
							System.out.print(temp);
						}//else
					}//if
					
					if(types.get(j).equalsIgnoreCase("integer")) {
						
						if(((String) r.get(j)).length()>=colSize) {
							temp=((String) temp).substring(0,13);
							System.out.println(temp+"...");
						}//if
						
						else {
							while(((String) temp).length()<colSize) {
								temp=((String) temp).concat(" ");
							}//while
							System.out.print(temp);
						}//else
					}//if
					}//for
					System.out.println();
				}//for
			}//else
		}//for
		
//Enable more than one response				
		out.print(">> ");
		System.out.println();
		text=in.nextLine();
		
		// TODO: Support tabular view, in a later module.

		}//while
		in.close();
	}//prompt
}//console
