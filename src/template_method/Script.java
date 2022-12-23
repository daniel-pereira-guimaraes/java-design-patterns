package template_method;

import java.util.List;

public abstract class Script {

	List<String> commands;
	
	public Script(List<String> commands) {
		this.commands = commands;
	}
	
	protected abstract void startTransaction();
	protected abstract void executeCommand(String command);
	protected abstract void commit();
	protected abstract void rollback();

	public void execute() {
		startTransaction();
		try {
			for (String command : commands) {
				if (command == null || command.trim().equals(""))
					throw new IllegalArgumentException("Invalid command: " + String.valueOf(command));
				executeCommand(command);
			}
			commit();
		} catch(Throwable e) {
			rollback();
			throw e;
		}
	}

}
