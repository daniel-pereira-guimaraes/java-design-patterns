package abstract_factory;

import java.util.List;

public class RestProductService implements ProductService {

	@Override
	public List<Product> findAll() {
		System.out.println(getClass().getSimpleName() + ".findAll");
		return null;
	}

	@Override
	public Product findById(Long id) {
		System.out.println(getClass().getSimpleName() + ".findById: " + id);
		return null;
	}

	@Override
	public Product save(Product person) {
		System.out.println(getClass().getSimpleName() + ".save: " + person);
		return null;
	}

	@Override
	public void delete(Long id) {
		System.out.println(getClass().getSimpleName() + ".delete: " + id);
	}

}