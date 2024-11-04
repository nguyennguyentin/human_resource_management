package org.example.human_resource_management.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Base_repo {
    private Connection connection;
    private static final String URL = "jdbc:mysql://localhost:3306/human_resource_management";
    private static final String USER = "root";
    private static final String PASS = "123456";

    public Base_repo() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(URL, USER, PASS);
            System.out.println("Connected");
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public Connection getConnection() {
        return connection;
    }
}
