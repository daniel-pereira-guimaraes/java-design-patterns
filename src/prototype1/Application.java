package prototype1;

public class Application {

	public static void main(String[] args) throws CloneNotSupportedException, InterruptedException {
		
		Person p1 = new Person(100L, "Emma");
		Person p2 = (Person) p1.clone();
		
		System.out.println("p1            : " + p1);
		System.out.println("p2            : " + p2);
		System.out.println("p1 == p2      : " + (p1 == p2));
		System.out.println("p1.equals(p2) : " + p1.equals(p2));
		
		p2.setName("Bob");
		System.out.println();
		System.out.println("After p2.setName(\"Bob\"):");
		System.out.println("p1            : " + p1);
		System.out.println("p2            : " + p2);
	}

}
