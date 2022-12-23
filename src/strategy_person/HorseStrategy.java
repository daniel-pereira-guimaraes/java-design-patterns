package strategy_person;

public class HorseStrategy implements MoveStrategy {

	@Override
	public void move() {
		System.out.println("Riding a horse.");
	}

}
