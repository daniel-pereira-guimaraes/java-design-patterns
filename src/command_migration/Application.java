package command_migration;

public class Application {

	public static void main(String[] args) throws InterruptedException {
		
		MigrationTool tool = new MigrationTool();
		
		tool.addMigration(new DatabaseV1());
		tool.addMigration(new DatabaseV2());
		tool.addMigration(new DatabaseV3());

		System.out.println("Up step by step...");
		for (int i = 0; i < 4; i++) {
			tool.up();
			System.out.println();
			Thread.sleep(1000);
		}

		System.out.println("---");
		System.out.println("Down step by step...");
		for (int i = 0; i < 4; i++) {
			tool.down();
			System.out.println();
			Thread.sleep(1000);
		}

		System.out.println("---");
		System.out.println("Go to last version");
		tool.last();
		System.out.println();
		
		System.out.println("\n---");
		System.out.println("Go to first version");
		tool.first();
	}

}
