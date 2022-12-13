package builder1;

public class Application {

	public static void main(String[] args) {
		Product p1 = new ProductBuilder("Keyboard")
				.andPrice(15.5)
				.build();

		Product p2 = new ProductBuilder("Keyboard")
				.andId(500L)
				.andPrice(15.5)
				.build();

		Product p3 = new ProductBuilder("Keyboard")
				.andId(500L)
				.andBarCode("7891234567890")
				.andPrice(15.5)
				.andStock(50.0)
				.build();
		
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
	}

}
