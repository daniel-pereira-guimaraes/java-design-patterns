package bridge_dao;

public class PersonMySqlDao implements PersonDao {

	@Override
	public void save(Person person) {
		System.out.println("Saving person into MySQL...");
	}

}
