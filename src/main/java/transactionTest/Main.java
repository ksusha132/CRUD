package transactionTest;


import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {

        CRUD crud = new CRUD();
        try {
            crud.createTable("Roles", "name", "kind");
        } catch (SQLException e) {
            e.printStackTrace();
        }

        try {
            crud.dropTable("Roles");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
