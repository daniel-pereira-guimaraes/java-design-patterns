package singleton2;

public class Connection {
	
	private static Connection instance;
	
	private Connection() {
		System.out.println("Creating connection object...");
	}
	
	public static Connection getInstance() {
		if (instance == null)
			instance = new Connection();
		return instance;
	}

}
