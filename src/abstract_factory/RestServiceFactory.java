package abstract_factory;

public class RestServiceFactory implements ServiceFactory {

	@Override
	public PersonService createPersonService() {
		return new RestPersonService();
	}

	@Override
	public ProductService createProductService() {
		return new RestProductService();
	}

}
