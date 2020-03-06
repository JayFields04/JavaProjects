package driver;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import adt.Database;
import adt.Response;
import adt.Row;
import adt.Table;

	
	public class DSquaredBelow implements Driver {
		private static final Pattern pattern;
		static {
			pattern = Pattern.compile(
				"Squares\\s+Below\\s+(\\d+)(?:\\s+AS\\s+(\\w+)\\s*(?:,\\s*(\\w+))?)?",
				Pattern.CASE_INSENSITIVE
			);
		}

		@Override
		public Response execute(Database db, String query) {
			Matcher matcher = pattern.matcher(query.trim());
			if (!matcher.matches()) return null;

			int upper = Integer.parseInt(matcher.group(1));
			String name = matcher.group(2) != null ? matcher.group(2) : "x";
			String name2 = matcher.group(3) != null ? matcher.group(3) : name + "_squared";
			
			if(name.equals(name2)) {
				return new Response(false,null, null);
			}//if
			
			Table table = new Table();
			
			table.getSchema().put("table_name", null);
			
			List<String> names = new ArrayList<>();
			names.add(name);
			names.add(name2);
			table.getSchema().put("column_names", names);
			
			List<String> types = new ArrayList<>();
			types.add("integer");
			types.add("integer");
			table.getSchema().put("column_types", types);
			
			table.getSchema().put("primary_index", 0);
			
			for (int i = 0; i*i < upper; i++) {
				Row row = new Row();
				row.add(i);
				row.add(i*i);
				table.put(i, row);
			}
			
			return new Response(true, null, table);
		}
}//DSquaredBelow
