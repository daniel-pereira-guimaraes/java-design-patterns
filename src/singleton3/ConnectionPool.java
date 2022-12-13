package singleton3;

public class ConnectionPool {
	
	private static class ConnectionEntry {
		private Connection connection = new Connection();
		private boolean inUse = false;
	}
	
	private static ConnectionPool instance = new ConnectionPool();
	private static final ConnectionEntry[] pool = new ConnectionEntry[3];
	
	static {
		for (int i = 0; i < pool.length; i++) {
			pool[i] = new ConnectionEntry();
		}
	}
	
	private ConnectionPool() {
		System.out.println("Creating connection pool...");
	}
	
	public static ConnectionPool getInstance() {
		return instance;
		
	}
	
	public Connection getConnection() {
		System.out.println("Getting connection...");
		for (ConnectionEntry ce : pool) {
			if (!ce.inUse) {
				ce.inUse = true;
				return ce.connection;
			}
		}
		throw new RuntimeException("Maximum number of connections exceeded!");
	}
	
	public void releaseConnection(Connection connection) {
		System.out.println("Releasing connection...");
		for (ConnectionEntry ce : pool) {
			if (ce.connection == connection) {
				ce.inUse = false;
				return;
			}
		}
		throw new RuntimeException("Connection not found in pool.");
	}

}
