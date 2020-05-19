package forWeb.day03.jdbc;

import java.io.Closeable;
import java.io.IOException;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DatabaseConnection implements Closeable {

    private static final String URL = "jdbc:postgresql://localhost:5432/phones_magazine";
    private static final String NAME = "postgres";
    private static final String PASSWORD = "shaiq1029A";
    private static Connection connection = null;

    public Connection getConnection() {
        try {
            connection = DriverManager.getConnection(URL, NAME, PASSWORD);
        } catch (SQLException ex) {
            Logger.getLogger(DatabaseConnection.class.getName()).log(Level.SEVERE, null, ex);
            ex.printStackTrace();
        }
        return connection;
    }

    @Override
    public void close() throws IOException {
        try {
            connection.close();
        } catch (SQLException ex) {
            Logger.getLogger(DatabaseConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
