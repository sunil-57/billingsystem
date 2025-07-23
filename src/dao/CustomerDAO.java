package dao;

import model.Customer;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CustomerDAO {
    private Connection conn;

    public CustomerDAO() throws SQLException, ClassNotFoundException {
        conn = DBConnection.connect();
    }

    public int saveCustomer(Customer customer) {
        int status = 0;
        String query = "INSERT INTO customer (name, houseNumber, unitsConsumed) VALUES (?,?,?)";
        if (conn != null) {
            try {
                PreparedStatement ps = conn.prepareStatement(query);
                ps.setString(1, customer.getName());
                ps.setString(2, customer.getHouseNumber());
                ps.setDouble(3, customer.getUnitsConsumed());
                if(ps.executeUpdate() > 0){
                    status = 1;
                }
            } catch (SQLException e) {
               status = -1;
            }
        }
        return status;
    }

}
