package bridge_dao;

public abstract class PersonService {
	
	final protected PersonDao dao;
	
	public PersonService(PersonDao dao) {
		this.dao = dao;
	}
	
	public abstract void save(Person person);

}
