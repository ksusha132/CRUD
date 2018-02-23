package transactionTest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

class DataBaseConnection {

    private static DataBaseConnection instance;

    private Connection connection;


    DataBaseConnection() throws SQLException {
        try {
            Class.forName("org.postgresql.Driver");
            String url = "jdbc:postgresql://localhost:5469/test";
            String username = "postgres";
            String password = "root";
            this.connection = DriverManager.getConnection(url, username, password);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public Connection getConnection() {
        return connection;
    }

    public static DataBaseConnection getInstance() throws SQLException {
        if (instance == null) {
            instance = new DataBaseConnection();
        } else if (instance.getConnection().isClosed()) {
            instance = new DataBaseConnection();
        }

        return instance;
    }
}
