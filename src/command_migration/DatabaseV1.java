package command_migration;

public class DatabaseV1 extends MigrationCommand {

	@Override
	public void execute() {
		System.out.println("CREATE TABLE product(...);");
		System.out.println("CREATE TABLE person(...);");
	}

	@Override
	public void undo() {
		System.out.println("DROP TABLE person;");
		System.out.println("DROP TABLE product;");
	}

}
