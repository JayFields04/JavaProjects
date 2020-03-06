package driver;
import adt.Response;
import adt.Database;
import adt.Table;
import adt.Row;
import java.util.List;
import java.util.Set;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class insertTable implements Driver {
	private static final Pattern pattern;
	static {
		pattern = Pattern.compile(
				"Insert\\s+Into\\s+([a-z]\\w*)\\s+(?:\\(((?:(?:[a-z]\\w*,?\\s*))+)\\)\\s+)?Values\\s+\\(((?:(?:[\\w\\W\\\\\"]+,?\\s*))+)\\)\\s*",
				Pattern.CASE_INSENSITIVE
				);
	}//pattern

	public Response execute(Database db, String query) {
		Matcher matcher = pattern.matcher(query.trim());
		if (!matcher.matches()) return null;
		
		String tableNames=matcher.group(1);
		String colNames=matcher.group(2);
		String values=matcher.group(3);
		
		Row row = new Row();
		Table table = db.get(tableNames);
		
		List<String>columnNames= new ArrayList<String>();
		List<String>columnTypes= new ArrayList<String>();
		List<String>reOrderValues= new ArrayList<String>();
		List<String>masterNamesList=(List<String>) table.getSchema().get("column_names");
		List<String>masterColTypes=(List<String>) table.getSchema().get("column_types");
		int primeIndex=(int) table.getSchema().get("primary_index");
		String[]name;
		String[] inputVals;	
        Set<String> hash_Set = new HashSet<String>(); 

		
		if (db.get(tableNames)==null) {
			return new Response(false, "Table does not exist", null);
		}//if
		
		
		
		if(colNames==null) {
			columnNames= (List<String>) table.getSchema().get("column_names");
		}//if
		else {
			name=colNames.split(",");
			
			for(int i=0;i<name.length;i++) {
				columnNames.add(name[i].trim());
				hash_Set.add(name[i].trim());
				
			}//for			
		}//else
		
		if(hash_Set.size()!=columnNames.size()) {
			return new Response(false,"Column names can not be repeated",null);
		}
		
		inputVals=values.split(",");
		for(int i=0;i<inputVals.length;i++) {
					inputVals[i]=inputVals[i].trim();
		}//for
		
		if(columnNames.size()!=inputVals.length) {
			return new Response(false,"Must be the same size", null);
		}//if
		
		for(int i=0;i<masterNamesList.size();i++) {
			reOrderValues.add(null);
		}//for
		
		for(int i=0; i<masterNamesList.size();i++) {
			for(int j=0; j<columnNames.size();j++) {
				if(masterNamesList.get(i).equals(columnNames.get(j))) {
				
				reOrderValues.set(i,inputVals[j] );
				}//if
			}//for
		}//for
		
		for(int i=0;i<reOrderValues.size();i++) {
			if(reOrderValues.get(i)==null) {
				row.add(null);
			}//if

//String			
			else if(masterColTypes.get(i).equals("string")) {
				if(reOrderValues.get(i).startsWith("\"")&&reOrderValues.get(i).endsWith("\"")) {
					reOrderValues.set(i,reOrderValues.get(i).replaceAll("\"",""));
					row.add(reOrderValues.get(i));
				}//if
				else if(reOrderValues.get(i).equalsIgnoreCase("null")) {
					row.add(null);
				}
				else {
					return new Response(false,"String can not contain a integer or boolean literals",null);
				}//if
			}//else if

//Integer			
			else if(masterColTypes.get(i).equals("integer")) {
				if(reOrderValues.get(i).equals("null")){
					row.add(null);
				}//if
				else if(reOrderValues.get(i).startsWith("0")&&reOrderValues.get(i).length()>1) {
					return new Response(false,"Cannot lead with 0",null);
				}
				else if(reOrderValues.get(i).contains(".")) {
					return new Response(false, "Integer can't contain a decimal", null);
				}//else if
				else if(reOrderValues.get(i).contains("true")||reOrderValues.get(i).contains("false")||reOrderValues.get(i).contains("\"")) {
					return new Response(false,"Integer can not have boolean or string literals", null);
				}
				else{
					row.add(Integer.parseInt(reOrderValues.get(i)));
				}//else
			}//else if

//Boolean		
			else if(masterColTypes.get(i).equals("boolean")) {
				if(reOrderValues.get(i).contains("\"")||reOrderValues.get(i).matches("\\d+")) {
					return new Response(false, "Boolean can not contain a string or integer literal", null);
				}//if
				else if(reOrderValues.get(i).equalsIgnoreCase("null")) {
					row.add(null);
				}
				else {
					row.add(Boolean.parseBoolean(reOrderValues.get(i)));
				}//else
			}//else
			
		}//for

		
		table.put(row.get(primeIndex),row);
		
		Table newTable=new Table();
		
		newTable.getSchema().put("table_name",null);
		newTable.getSchema().put("column_names",masterNamesList);
		newTable.getSchema().put("column_types",masterColTypes);
		newTable.getSchema().put("primary_index",primeIndex);
		newTable.put(row.get(primeIndex),row);
		
	return new Response(true, "Row inserted into table", newTable);	
	}//execute
}//insertTable
