package bridge_dao;

public class PersonMongoDao implements PersonDao {

	@Override
	public void save(Person person) {
		System.out.println("Saving person into MongoDB...");
	}

}
