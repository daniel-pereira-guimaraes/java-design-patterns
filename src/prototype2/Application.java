package prototype2;

public class Application {

	public static void main(String[] args) throws CloneNotSupportedException, InterruptedException {
		
		Person p1 = new Person(100L, "Emma", new Address("One", 111));
		Person p2 = (Person) p1.clone();

		System.out.println("p1: " + p1);
		System.out.println("p2: " + p2);
		
		p2.setName("Bob");
		p2.getAddress().setStreet("Two");
		p2.getAddress().setNumber(222);
		
		System.out.println();
		System.out.println("After p2 changes:");
		System.out.println("p1: " + p1);
		System.out.println("p2: " + p2);
	}

}
