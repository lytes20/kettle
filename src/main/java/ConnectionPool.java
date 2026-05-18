public class ConnectionPool {
    private static ConnectionPool pool;

    private Connection connection = new Connection();

    private ConnectionPool() {
        if (pool != null) {
            throw new RuntimeException("Use getInstance() method to get the single instance of this class");
        }
    }

    public static ConnectionPool getPool() {
        if (pool == null) {
            synchronized (ConnectionPool.class) {
                if (pool == null) pool = new ConnectionPool();
            }

        }
        return pool;
    }

    public Connection getConnection() {
        return connection;
    }
}
