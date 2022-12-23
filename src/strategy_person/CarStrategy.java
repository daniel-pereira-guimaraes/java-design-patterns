package strategy_person;

public class CarStrategy implements MoveStrategy {

	@Override
	public void move() {
		System.out.println("Driving car.");
	}

}
