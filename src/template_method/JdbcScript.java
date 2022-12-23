package template_method;

import java.util.List;

public class JdbcScript extends Script {

	public JdbcScript(List<String> commands) {
		super(commands);
	}

	@Override
	protected void startTransaction() {
		System.out.println("JDBC startTransaction");
	}

	@Override
	protected void executeCommand(String command) {
		System.out.println("JDBC execute: " + command);
	}

	@Override
	protected void commit() {
		System.out.println("JDBC commit");
	}

	@Override
	protected void rollback() {
		System.out.println("JDBC rollback");
	}

}
