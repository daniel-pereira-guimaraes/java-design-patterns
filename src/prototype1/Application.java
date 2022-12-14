package prototype1;

public class Application {

	public static void main(String[] args) throws CloneNotSupportedException, InterruptedException {
		
		Product p1 = new Product(100L, "Keyboard", 20.0);
		Product p2 = (Product) p1.clone();
		
		System.out.println("p1            : " + p1);
		System.out.println("p2            : " + p2);
		System.out.println("p1 == p2      : " + (p1 == p2));
		System.out.println("p1.equals(p2) : " + p1.equals(p2));		
	}

}
