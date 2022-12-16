package bridge_dao;

public class PersonSoapService extends PersonService {

	public PersonSoapService(PersonDao dao) {
		super(dao);
	}

	@Override
	public void save(Person person) {
		System.out.print("Soap: ");
		dao.save(person);
	}

}
