package driver;

import adt.Response;
import adt.Database;
import adt.Table;
import adt.Row;
import java.util.List;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class dumpTable implements Driver{
	private static final Pattern pattern;
	static {
		pattern = Pattern.compile(
			"dump\\s+table\\s+([\\w]+)*",
			Pattern.CASE_INSENSITIVE
		);
	}//pattern
	
	@Override
	public Response execute(Database db, String query) {
		Matcher matcher = pattern.matcher(query.trim());
		if (!matcher.matches()) return null;
	
		String match1=matcher.group(1);
		
		int count =0;
		
		for(int i=0; i<db.size();i++) {
			for(int j=0;i<db.size();j++) {
				
			}//for
		}//for
		
//Change this response after fixing M2		
		return new Response(true,null, null);
		
	}//execute
}//dumpTable
