// Alternative for fluent builder pattern (Daniel Pereira Guimarães).
package builder3;

public class Application {

	public static void main(String[] args) {
		
		Product p1 = new Product("Keyboard")
				.setPrice(15.5);
		
		Product p2 = new Product("Mouse")
				.setId(500L)
				.setPrice(5.0);
		
		Product p3 = new Product("TV")
				.setId(30L)
				.setBarCode("7891234567890")
				.setPrice(15.5)
				.setStock(250.0);
		
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
	}

}
