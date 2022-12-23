package strategy_person;

public class MeatFoodStrategy implements EatStrategy {

	@Override
	public void eat() {
		System.out.println("Eating meat.");
	}
	

}
