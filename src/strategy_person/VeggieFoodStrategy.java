package strategy_person;

public class VeggieFoodStrategy implements EatStrategy {

	@Override
	public void eat() {
		System.out.println("Eating vegetables.");
	}

}
