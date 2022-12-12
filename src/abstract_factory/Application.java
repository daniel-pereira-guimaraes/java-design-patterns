package abstract_factory;

import java.util.Scanner;

public class Application {
	
	public static void main(String[] args) {
		
		Person person = new Person(1L, "Emma");
		Product product = new Product(1L, "Keyboard", 15.0);
		
		ServiceFactory serviceFactory;
		System.out.print("Enter repository (1=JPA, 2=Rest): ");
		try (Scanner scanner = new Scanner(System.in)) {
			int i = scanner.nextInt();
			if (i == 1)
				serviceFactory = new JpaServiceFactory();
			else if (i == 2)
				serviceFactory = new RestServiceFactory();
			else
				throw new RuntimeException("Invalid repository choice.");
		}
		
		PersonService personService = serviceFactory.createPersonService();
		ProductService productService = serviceFactory.createProductService();
		
		System.out.println("\nProcessing persons...");
		personService.findAll();
		personService.save(person);
		personService.findById(5L);
		personService.delete(2L);
		
		System.out.println("\nProcessing products...");
		productService.findAll();
		productService.save(product);
		productService.findById(5L);
		productService.delete(2L);
	}

}
