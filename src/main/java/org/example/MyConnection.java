package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MyConnection {
    Connection establishConnection() {
        Connection connect = null;
        try {
            connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/bank_app", "root", "root");
            System.out.println("Connection established...");
            return connect;
        } catch (SQLException ex) {
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        }
        return null;
    }
}
