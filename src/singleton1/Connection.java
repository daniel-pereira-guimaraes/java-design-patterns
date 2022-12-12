package singleton1;

public class Connection {
	
	private final static Connection instance = new Connection();
	
	private Connection() {
		System.out.println("Creating connection object...");
	}
	
	public static Connection getInstance() {
		return instance;
	}

}
