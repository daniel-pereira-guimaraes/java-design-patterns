package command_migration;

public class DatabaseV2 extends MigrationCommand {

	@Override
	public void execute() {
		System.out.println("ALTER TABLE product ADD barcode VARCHAR(14);");
		System.out.println("CREATE TABLE sale(...);");
		System.out.println("CREATE TABLE saleitem(...);");
	}

	@Override
	public void undo() {
		System.out.println("DROP TABLE saleitem;");
		System.out.println("DROP TABLE sale;");
		System.out.println("ALTER TABLE product DROP barcode;");
	}

}
