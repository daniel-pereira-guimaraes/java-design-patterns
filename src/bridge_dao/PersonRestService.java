package bridge_dao;

public class PersonRestService extends PersonService {

	public PersonRestService(PersonDao dao) {
		super(dao);
	}

	@Override
	public void save(Person person) {
		System.out.print("Rest: ");
		dao.save(person);
	}

}
