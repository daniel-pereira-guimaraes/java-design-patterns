package strategy_person;

public class Application {

	public static void main(String[] args) {
		
		MeatFoodStrategy meatFoodStrategy = new MeatFoodStrategy();
		VeggieFoodStrategy veggieFoodStrategy = new VeggieFoodStrategy();
		
		CarStrategy carStrategy = new CarStrategy();
		HorseStrategy horseStrategy = new HorseStrategy();
		
		TeacherStrategy teacherStrategy = new TeacherStrategy();
		DeveloperStrategy developerStrategy = new DeveloperStrategy();
		
		Person p1 = new Person("Emma", meatFoodStrategy, horseStrategy, teacherStrategy);
		Person p2 = new Person("Jhon", veggieFoodStrategy, horseStrategy, developerStrategy);
		Person p3 = new Person("Anna", veggieFoodStrategy, carStrategy, teacherStrategy);
		
		System.out.println("::: " + p1 + " :::");
		p1.eat();
		p1.move();
		p1.work();
		
		System.out.println();
		System.out.println("::: " + p2 + " :::");
		p2.eat();
		p2.move();
		p2.work();
		
		System.out.println();
		System.out.println("::: " + p3 + " :::");
		p3.eat();
		p3.move();
		p3.work();
	}

}
