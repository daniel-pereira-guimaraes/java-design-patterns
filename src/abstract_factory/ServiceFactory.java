package abstract_factory;

public interface ServiceFactory {

	PersonService createPersonService();
	ProductService createProductService();
	
}
