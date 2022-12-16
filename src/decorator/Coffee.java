package decorator;

public class Coffee implements Drink {

	@Override
	public void serve() {
		System.out.println("Serving 100ml coffee...");
	}

	@Override
	public double getPrice() {
		return 2.0;
	}

}
