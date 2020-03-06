package driver;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import adt.Database;
import adt.Response;
import adt.Row;
import adt.Table;
import java.util.*;
	
		public class createTable implements Driver {
			private static final Pattern pattern;
			static {
				pattern = Pattern.compile(
						
//Something still wrong about expression	
					"Create\\s+Table\\s+([A-Z|a-z][A-Z_0-9]*)\\s+\\(((?:(?:\\s*(?:Primary)?)\\s*(?:Integer|String|Boolean)\\s+\\w+)(?:(?:\\s*,\\s*(?:Primary)?)\\s*(?:Integer|String|Boolean)\\s+\\w*)*)\\s*\\)",
					Pattern.CASE_INSENSITIVE
				);
			}//pattern

			@Override
			public Response execute(Database db, String query) {
				Matcher matcher = pattern.matcher(query.trim());
				if (!matcher.matches()) return null;
				
				Table table = new Table();
				boolean checker= false;
				
				String Query2= query.substring(query.indexOf('(')+1,query.indexOf(')'));
			
				String tableN=matcher.group(1);
				String[] colN=Query2.split(",");			
				
				table.getSchema().put("table_name", tableN);
				
				
				List<String> names = new ArrayList<>();
				List<String> types= new ArrayList<>();
				
				String [] arr;
				
				int count=0;
				int tracker=50;
				
					for(int i = 0; i<colN.length;i++) {
						arr=colN[i].trim().split(" ");

						if(arr[0].equalsIgnoreCase("primary")) {
							
							tracker=i;
							table.getSchema().put("primary_index",tracker);
							
							names.add(arr[2]);
							types.add(arr[1].toLowerCase());
							
							count++;							
						}//if
						
						else {	
							names.add(arr[1]);
							types.add(arr[0].toLowerCase());							
						}//else

					}//for
					
//If they have the same table Name
					if(db.containsKey(tableN)!= checker) {
						return new Response(false, "Table name already exist",null);
					}
					
					
//Conditions for PRIMARY						
					if(count<1) {
						return new Response(false, "No PRIMARY found!", null);
					}//if
					
					else if(count>1) {
						return new Response(false, "More than one PRIMARY found!", null);
					}//else if
					
					else {
						
					}//else
					
				table.getSchema().put("column_names", names);

				table.getSchema().put("column_types", types);
				
				db.put(matcher.group(1),table);
				
				return new Response(true, null, table);
			}//execute
	}//createTable

