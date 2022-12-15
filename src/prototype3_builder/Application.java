package prototype3_builder;

public class Application {

	public static void main(String[] args) throws CloneNotSupportedException, InterruptedException {
		
		Person p1 = new Person(100L, "Emma", new Address("One", 111));
		
		Person p2 = new Person.CloneBuilder(p1.getName())
				.withId(p1.getId())
				.withAddress(p1.getAddress())
				.build();
		
		Person p3 = new Person.CloneBuilder(p1.getName())
				.withId(p1.getId() + 1)
				.withAddress(new Address("Two", 222))
				.build();

		System.out.println("p1: " + p1);
		System.out.println("p2: " + p2);
		System.out.println("p3: " + p3);
		System.out.println("p1 == p2: " + (p1 == p2));
		System.out.println("p1 == p3: " + (p1 == p3));
		System.out.println("p1.equals(p2): " + p1.equals(p2));
		System.out.println("p1.equals(p3): " + p1.equals(p3));
	}

}
