package template_method;

import java.util.Arrays;

public class Application {

	public static void main(String[] args) {
		
		Script script1 = new JdbcScript(Arrays.asList(
			"CREATE TABLE a(...)",
			"CREATE TABLE b(...)",
			"ALTER TABLE a ADD total..."));
		
		Script script2 = new JdbcScript(Arrays.asList(
			"CREATE TABLE c(...)",
			"CREATE TABLE d(...)",
			null,
			"DROP TABLE a"));

		try {
			script1.execute();
			script2.execute();
		} catch(RuntimeException e) {
			System.out.println("Error! " + e.getMessage());
		}

	}

}
