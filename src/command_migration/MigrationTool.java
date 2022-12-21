package command_migration;

import java.util.ArrayList;
import java.util.List;

public class MigrationTool {
	
	private List<MigrationCommand> migrations = new ArrayList<>();
	private int nextMigrationIndex = 0;
	
	public void addMigration(MigrationCommand migration) {
		migrations.add(migration);
	}

	public void up() {
		if (nextMigrationIndex < migrations.size()) {
			migrations.get(nextMigrationIndex).execute();
			nextMigrationIndex++;
		} else {
			System.out.println("Already up to date!");
		}
	}
	
	public void down() {
		if (nextMigrationIndex > 0) {
			migrations.get(nextMigrationIndex - 1).undo();
			nextMigrationIndex--;
		} else {
			System.out.println("No have prior migrations!");
		}
	}
	
	public void last() {
		while (nextMigrationIndex < migrations.size()) 
			up();
	}
	
	public void first() {
		while (nextMigrationIndex != 0)
			down();
	}
	
}
