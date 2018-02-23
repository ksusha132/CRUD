package transactionTest;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class CRUD {

    Connection connection = null;
    Statement statement = null;
    DataBaseConnection dataBaseConnection;

    {
        try {
            dataBaseConnection = new DataBaseConnection();
            connection = dataBaseConnection.getConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    public void createTable(String name, String field1, String field2) throws SQLException {
        statement = connection != null ? connection.createStatement() : null;
        statement.execute("create table " + name + "(" +
                "id integer primary key, " +
                 field1 + " varchar(100)," +
                 field2 + " VARCHAR(10));");

    }

    public void dropTable(String name) throws SQLException {
        statement = connection != null ? connection.createStatement() : null;
        statement.execute("DROP TABLE " + name);

    }


   public void create(String tableName) throws SQLException {
       statement = connection != null ? connection.createStatement() : null;
       statement.execute("INSERT INTO " + tableName + " VALUES ");

    }

    public Client update(Client client) throws SQLException {
        statement = connection != null ? connection.createStatement() : null;
        return null;
    }

    public void delete(Client client) throws SQLException {
        statement = connection != null ? connection.createStatement() : null;
    }

    public Client find() throws SQLException {
        statement = connection != null ? connection.createStatement() : null;
        return null;
    }
}
