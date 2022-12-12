package abstract_factory;

import java.util.List;

public class RestPersonService implements PersonService {

	@Override
	public List<Person> findAll() {
		System.out.println(getClass().getSimpleName() + ".findAll");
		return null;
	}

	@Override
	public Person findById(Long id) {
		System.out.println(getClass().getSimpleName() + ".findById: " + id);
		return null;
	}

	@Override
	public Person save(Person person) {
		System.out.println(getClass().getSimpleName() + ".save: " + person);
		return null;
	}

	@Override
	public void delete(Long id) {
		System.out.println(getClass().getSimpleName() + ".delete: " + id);
	}

}