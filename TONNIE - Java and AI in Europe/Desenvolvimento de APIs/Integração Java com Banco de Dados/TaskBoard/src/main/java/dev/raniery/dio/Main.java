package dev.raniery.dio;

import dev.raniery.dio.strategy.MigrationStrategy;

import java.sql.SQLException;

import static dev.raniery.dio.persistence.config.ConnectionConfig.getConnection;

public class Main {
    public static void main(String[] args) {

        try (var connection = getConnection()) {
            new MigrationStrategy(connection).executeMigration();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
