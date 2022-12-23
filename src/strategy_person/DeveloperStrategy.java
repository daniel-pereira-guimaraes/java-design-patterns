package strategy_person;

public class DeveloperStrategy implements WorkStrategy {

	@Override
	public void work() {
		System.out.println("Programming in Java.");
	}

}
