package dev.raniery.dio.config;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public final class ConnectionConfig {

    public static Connection getConnection() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/taskboard";
        String user = "root";
        String passwd = "root";

        Connection connection = DriverManager.getConnection(url, user, passwd);
        connection.setAutoCommit(false);
        return connection;
    }
}
