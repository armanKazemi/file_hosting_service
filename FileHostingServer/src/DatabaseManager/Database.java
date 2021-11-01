package DatabaseManager;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Database {

    protected String databaseAddress = "jdbc:sqlite:E:\\server.db";
    protected Connection connection;

    public Database() {
        try {
            connection = DriverManager.getConnection(databaseAddress);

        } catch (SQLException e) {System.out.println(e.getMessage());}
    }

    public void createUsersTable() {
        try {
            Statement statement = connection.createStatement();
            statement.execute("CREATE TABLE IF NOT EXISTS 'users' (inAppName TEXT, userName TEXT UNIQUE , password TEXT, profilePicture TEXT)");

        } catch (SQLException e) {System.out.println("Error in connecting to users table");}
    }



}
