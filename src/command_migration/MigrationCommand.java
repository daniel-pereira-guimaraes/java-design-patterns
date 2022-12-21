package command_migration;

public abstract class MigrationCommand {
	
	public abstract void execute();
	public abstract void undo();

}
