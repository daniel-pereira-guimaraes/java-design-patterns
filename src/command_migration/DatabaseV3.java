package command_migration;

public class DatabaseV3 extends MigrationCommand {

	@Override
	public void execute() {
		System.out.println("ALTER TABLE product ALTER barcode TO gtin;");
	}

	@Override
	public void undo() {
		System.out.println("ALTER TABLE product ALTER gtin TO barcode;");
	}

}
