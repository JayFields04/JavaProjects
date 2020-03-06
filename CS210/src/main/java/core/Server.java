package core;

import driver.*;
import adt.Response;
import adt.Database;

import java.util.List;
import java.util.LinkedList;

/** 
 * This class implements a server with an active
 * connection to a backing database.
 * 
 * Finish implementing the required features
 * but do not modify the protocols.
 */
public class Server {
	@SuppressWarnings("unused")
	private static final String
		STUDENT_NAME  = "Jaquez Fields",
		STUDENT_IDNUM = "800186889",
		STUDENT_EMAIL = "jmf0007@mix.wvu.edu";
	
	private Database database;
	private List<Driver> drivers;
	
	public Server() {
		this(new Database());
	}
	
	public Server(Database database) {
		this.database = database;
		
		// TODO: Add each new driver as it is implemented.
		drivers = new LinkedList<Driver>();
		drivers.add(new DEcho());
		
//added DRange and DSquaredBelow 		
		drivers.add(new DSquaredBelow());
		drivers.add(new DRange());
		
//added createTable, dropTable, and showTable 		
		drivers.add(new createTable());
		drivers.add(new dropTable());
//Still not completely working	
		drivers.add(new showTable());
		
//added dumpTable and insertTable		
//		drivers.add(new dumpTable());
		drivers.add(new insertTable());
	}
	
	public Database database() {
		return database;
	}
	
	public List<Response> interpret(String script) {
		/*
		 * TODO: This wrongly assumes the entire script
		 * is a single query. However, there may be
		 * one or more semicolon-delimited queries in
		 * the script to be split and parsed distinctly.
		 */
		List<Response> responses = new LinkedList<Response>();;
		String[] queries = script.split(";");
		Response response;
		
		
		
		
		/* TODO: This only checks the first driver for a
		 * response to the first query. Instead, iterate over
		 * all drivers until one of them gives a response
		 * for the first query. Default to a failure response
		 * only if no driver gave a response for a query.
		 * Then iterate again for the next query. Don't
		 * forget to pass a reference to the actual database.
		 */
		for (int i=0;i<queries.length;i++ ) {
				
			for(int x=0;x<drivers.size();x++) {
				response = drivers.get(x).execute(database, queries[i]);
				
				if (response != null) {
					responses.add(response);
				}//if
			}//for inner
			
			if(responses.size()-1!=i) {
				responses.add(new Response(false, "Unrecognized query", null));
			}//if
		}//outter for
		return responses;
		
	}//public List
}//Server
