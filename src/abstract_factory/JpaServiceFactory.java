package abstract_factory;

public class JpaServiceFactory implements ServiceFactory {

	@Override
	public PersonService createPersonService() {
		return new JpaPersonService();
	}

	@Override
	public ProductService createProductService() {
		return new JpaProductService();
	}
	

}
