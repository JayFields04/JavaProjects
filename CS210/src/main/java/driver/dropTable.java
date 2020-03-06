package driver;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import adt.Database;
import adt.Response;
import adt.Row;
import adt.Table;

public class dropTable implements Driver {
	private static final Pattern pattern;
	static {
		pattern = Pattern.compile(
			"drop\\s+table\\s+((([\\w]+)*))",
			Pattern.CASE_INSENSITIVE
		);
	}//pattern
	
	@Override
	public Response execute(Database db, String query) {
		Matcher matcher = pattern.matcher(query.trim());
		if (!matcher.matches()) return null;
		
		String match1=matcher.group(1);
		
		if(db.containsKey(match1)) {
			Table table=db.get(match1);
			db.remove(match1);
			
			return new Response(true,null,table);
			
		}//if
		else {
			return new Response(false, "Enter valid name", null);
		}//else
		
	}//execute
}//dropTable
