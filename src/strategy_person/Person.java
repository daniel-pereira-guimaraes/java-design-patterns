package strategy_person;

public class Person {
	
	private String name; 
	private EatStrategy eatStrategy;
	private MoveStrategy moveStrategy;
	private WorkStrategy workStrategy;
	
	public Person(String name, EatStrategy eatStrategy, MoveStrategy moveStrategy, WorkStrategy workStrategy) {
		super();
		this.name = name;
		this.eatStrategy = eatStrategy;
		this.moveStrategy = moveStrategy;
		this.workStrategy = workStrategy;
	}
	
	public void eat() {
		eatStrategy.eat();
	}
	
	public void move() {
		moveStrategy.move();
	}
	
	public void work() {
		workStrategy.work();
	}

	@Override
	public String toString() {
		return name;
	}

}
