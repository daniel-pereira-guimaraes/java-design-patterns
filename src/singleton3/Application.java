package singleton3;

public class Application {

	public static void main(String[] args) {
		System.out.println(Application.class.getName());

		ConnectionPool pool = ConnectionPool.getInstance();
		Connection[] connections = new Connection[10];
		
		try {
			for (int i = 0; i < connections.length; i++)
				connections[i] = pool.getConnection();
		} catch (RuntimeException e) {
			System.out.println(e.getMessage());
		}
		
		pool.releaseConnection(connections[0]);
		pool.releaseConnection(connections[2]);
		
		try {
			for (int i = 0; i < connections.length; i++)
				connections[i] = pool.getConnection();
		} catch (RuntimeException e) {
			System.out.println(e.getMessage());
		}
		
	}
	
}
