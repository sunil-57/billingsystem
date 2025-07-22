package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    private static String dbName = "billsystemdb";
    private static String path = "jdbc:mysql://localhost:3306/"+dbName;
    private static String username = "root";
    private static String password = "";

    public static Connection connect() throws ClassNotFoundException, SQLException {
        Connection conn = null;
        Class.forName("com.mysql.cj.jdbc.Driver");
        conn = DriverManager.getConnection(path, username, password);
        return conn;
    }
}
