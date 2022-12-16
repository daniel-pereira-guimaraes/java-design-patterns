package decorator;

public class DoubleDrinkDecorator extends DrinkDecorator {

	public DoubleDrinkDecorator(Drink drink) {
		super(drink);
	}

	@Override
	public void serve() {
		drink.serve();
		drink.serve();
	}

	@Override
	public double getPrice() {
		return drink.getPrice() * 2;
	}

}
