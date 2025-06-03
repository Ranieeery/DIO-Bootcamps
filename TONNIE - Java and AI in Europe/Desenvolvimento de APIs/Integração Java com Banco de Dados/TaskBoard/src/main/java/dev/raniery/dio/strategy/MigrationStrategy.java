package dev.raniery.dio.strategy;

import liquibase.Liquibase;
import liquibase.database.jvm.JdbcConnection;
import liquibase.exception.LiquibaseException;
import liquibase.resource.ClassLoaderResourceAccessor;
import lombok.RequiredArgsConstructor;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.sql.Connection;

@RequiredArgsConstructor
public class MigrationStrategy {

    private final Connection connection;

    public void executeMigration() {
        PrintStream out = System.out;
        PrintStream err = System.err;

        try (var fos = new FileOutputStream("liquibase.log")) {
            System.setOut(new PrintStream(fos));
            System.setErr(new PrintStream(fos));

            try (var jdbcConnection = new JdbcConnection(this.connection)) {
                var liquibase = new Liquibase(
                    "/db/changelog/db.changelog-main.yml",
                    new ClassLoaderResourceAccessor(), jdbcConnection);
                liquibase.update();
            } catch (LiquibaseException e) {
                e.printStackTrace();
                System.setErr(err);
                throw new RuntimeException("Migration failed", e);
            }

        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException("Failed to create log file", e);
        } finally {
            System.setOut(out);
            System.setErr(err);
        }
    }
}
