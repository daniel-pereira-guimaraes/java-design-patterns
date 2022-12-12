package singleton1;

public class Application {

	public static void main(String[] args) {
		System.out.println(Application.class.getName());
		System.out.println("Testing Connection class...");
		Connection c1 = Connection.getInstance();
		Connection c2 = Connection.getInstance();
		Connection c3 = Connection.getInstance();
		if (c1 == c2 && c2 == c3) 
			System.out.println("c1 == c2 == c3");
	}
	
}
