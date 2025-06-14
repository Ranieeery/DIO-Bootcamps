package dev.raniery.dio.persistence.dao;

import com.mysql.cj.jdbc.StatementImpl;
import dev.raniery.dio.persistence.entity.BoardEntity;
import lombok.AllArgsConstructor;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Optional;

@AllArgsConstructor
public class BoardDAO {

    private Connection connection;

    public void insert(final BoardEntity entity) throws SQLException {

        String sql = "INSERT INTO BOARDS (name) values (?);";

        try (var statement = connection.prepareStatement(sql)) {
            statement.setString(1, entity.getName());
            statement.executeUpdate();
            if (statement instanceof StatementImpl impl) {
                entity.setId(impl.getLastInsertID());
            }
        }
    }

    public Optional<BoardEntity> findById(final Long id) throws SQLException {

        String sql = "SELECT id, name FROM BOARDS WHERE id = ?;";

        try (var statement = connection.prepareStatement(sql)) {
            statement.setLong(1, id);
            statement.executeQuery();
            var resultSet = statement.getResultSet();

            if (resultSet.next()) {
                var entity = new BoardEntity();
                entity.setId(resultSet.getLong("id"));
                entity.setName(resultSet.getString("name"));
                return Optional.of(entity);
            }

            return Optional.empty();
        }
    }

    public boolean exists(final Long id) throws SQLException {

        String sql = "SELECT 1 FROM BOARDS WHERE id = ?;";

        try (var statement = connection.prepareStatement(sql)) {
            statement.setLong(1, id);
            statement.executeQuery();
            return statement.getResultSet().next();
        }
    }

    public void delete(final Long id) throws SQLException {

        String sql = "DELETE FROM BOARDS WHERE id = ?;";

        try (var statement = connection.prepareStatement(sql)) {
            statement.setLong(1, id);
            statement.executeUpdate();
        }
    }
}
