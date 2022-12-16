package bridge_dao;

public class PersonOracleDao implements PersonDao {

	@Override
	public void save(Person person) {
		System.out.println("Saving person into Oracle...");
	}

}
