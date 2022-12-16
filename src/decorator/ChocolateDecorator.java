package decorator;

public class ChocolateDecorator extends DrinkDecorator {

	public ChocolateDecorator(Drink drink) {
		super(drink);
	}

	@Override
	public void serve() {
		drink.serve();
		System.out.println("Adding chocolate to " + drink.getClass().getSimpleName() + "...");
	}

	@Override
	public double getPrice() {
		return drink.getPrice() + 1.0;
	}

}
