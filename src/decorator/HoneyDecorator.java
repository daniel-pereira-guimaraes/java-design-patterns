package decorator;

public class HoneyDecorator extends DrinkDecorator {

	public HoneyDecorator(Drink drink) {
		super(drink);
	}

	@Override
	public void serve() {
		drink.serve();
		System.out.println("Adding honey to " + drink.getClass().getSimpleName() + "...");
	}

	@Override
	public double getPrice() {
		return drink.getPrice() + 0.5;
	}

}
