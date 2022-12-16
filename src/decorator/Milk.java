package decorator;

public class Milk implements Drink {

	@Override
	public void serve() {
		System.out.println("Serving 200ml milk...");
	}

	@Override
	public double getPrice() {
		return 3.5;
	}

}
