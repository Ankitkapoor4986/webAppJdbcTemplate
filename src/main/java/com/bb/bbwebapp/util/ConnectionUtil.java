package com.bb.bbwebapp.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



public class ConnectionUtil {

	public static final String JDBC_MYSQL_LOCALHOST = "jdbc:mysql://localhost:3306/";
    public static final String ROOT_USERNAME_AND_PASSWORD = "root";
    public static final String LPORTAL_DB="lportal";

    public static Connection getConnection() {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(
                    JDBC_MYSQL_LOCALHOST.concat(LPORTAL_DB),
                    ROOT_USERNAME_AND_PASSWORD,
                    ROOT_USERNAME_AND_PASSWORD);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }
}
