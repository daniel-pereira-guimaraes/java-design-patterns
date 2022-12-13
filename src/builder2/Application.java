package builder2;

public class Application {

	public static void main(String[] args) {
		Product p1 = new Product.Builder("Keyboard")
				.andPrice(15.5)
				.build();

		Product p2 = new Product.Builder("Mouse")
				.andId(500L)
				.andPrice(5.0)
				.build();

		Product p3 = new Product.Builder("TV")
				.andId(30L)
				.andBarCode("7891234567890")
				.andPrice(15.5)
				.andStock(250.0)
				.build();
		
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
	}

}
