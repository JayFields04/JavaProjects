package driver;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import adt.Database;
import adt.Response;
import adt.Row;
import adt.Table;

//Class not completely working yet
public class showTable implements Driver {
	private static final Pattern pattern;
	static {
		pattern = Pattern.compile(		
			"show\\s+tables",
			Pattern.CASE_INSENSITIVE
		);
	}//pattern

	@Override
	public Response execute(Database db, String query) {
		Matcher matcher = pattern.matcher(query.trim());
		if (!matcher.matches()) return null;
		
		Table table = new Table();
		
		table.getSchema().put("table_name",null);
		table.getSchema().put("primary_index", 0);
		
		List<String>names=new ArrayList<>();
		List<String>types=new ArrayList<>();
		
		names.add("table_name");
		names.add("row_count");
		
		types.add("string");
		types.add("integer");
		
		table.getSchema().put("column_names", names);
		table.getSchema().put("column_types", types);
		
		
		for(String i: db.keySet()) {
			
			Row rows= new Row();
			
			rows.add(db.get(i).getSchema().get("table_name"));
			rows.add(db.get(i).size());
			
			table.put(i,rows);
		}//for
		 return new Response(true,null,table);
	}//execute
}//showTable
