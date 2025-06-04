package dev.raniery.dio;

import dev.raniery.dio.strategy.MigrationStrategy;
import dev.raniery.dio.ui.MainMenu;

import java.sql.SQLException;

import static dev.raniery.dio.persistence.config.ConnectionConfig.getConnection;

public class Main {
    public static void main(String[] args) throws SQLException {

        try (var connection = getConnection()) {
            new MigrationStrategy(connection).executeMigration();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        new MainMenu().execute();
    }
}
