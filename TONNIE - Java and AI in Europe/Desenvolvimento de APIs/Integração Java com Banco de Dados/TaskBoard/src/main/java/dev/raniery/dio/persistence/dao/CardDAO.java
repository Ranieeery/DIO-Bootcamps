package dev.raniery.dio.persistence.dao;

import com.mysql.cj.jdbc.StatementImpl;
import dev.raniery.dio.dto.CardDetailsDTO;
import dev.raniery.dio.persistence.entity.CardEntity;
import lombok.AllArgsConstructor;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Optional;

import static dev.raniery.dio.persistence.dao.OffsetDateTimeConverter.toOffsetDateTime;
import static java.util.Objects.nonNull;

@AllArgsConstructor
public class CardDAO {

    private Connection connection;

    public void insert(final CardEntity entity) throws SQLException {

        String sql = "INSERT INTO CARDS (title, description, board_column_id) values (?, ?, ?);";

        try (var statement = connection.prepareStatement(sql)) {
            int i = 1;
            statement.setString(i++, entity.getTitle());
            statement.setString(i++, entity.getDescription());
            statement.setLong(i, entity.getBoardColumn().getId());
            statement.executeUpdate();

            if (statement instanceof StatementImpl impl) {
                entity.setId(impl.getLastInsertID());
            }
        }
    }

    public void moveToColumn(final Long columnId, final Long cardId) throws SQLException {

        String sql = "UPDATE CARDS SET board_column_id = ? WHERE id = ?;";

        try (var statement = connection.prepareStatement(sql)) {
            int i = 1;
            statement.setLong(i++, columnId);
            statement.setLong(i, cardId);
            statement.executeUpdate();
        }
    }

    public Optional<CardDetailsDTO> findById(final Long id) throws SQLException {

        String sql =
            """
                SELECT c.id,
                    c.title,
                    c.description,
                    b.blocked_at,
                    b.blocked_reason,
                    c.board_column_id,
                    bc.name,
                    (SELECT COUNT(sub_b.id)
                        FROM BLOCKS sub_b
                        WHERE sub_b.card_id = c.id) blocks_amount
                FROM CARDS c
                LEFT JOIN BLOCKS b
                    ON c.id = b.card_id
                AND b.unblocked_at IS NULL
                INNER JOIN BOARDS_COLUMNS bc
                    ON bc.id = c.board_column_id
                WHERE c.id = ?;
                """;

        try (var statement = connection.prepareStatement(sql)) {

            statement.setLong(1, id);
            statement.executeQuery();

            var resultSet = statement.getResultSet();

            if (resultSet.next()) {
                CardDetailsDTO dto = new CardDetailsDTO(
                    resultSet.getLong("c.id"),
                    resultSet.getString("c.title"),
                    resultSet.getString("c.description"),
                    nonNull(resultSet.getString("b.blocked_reason")),
                    toOffsetDateTime(resultSet.getTimestamp("b.blocked_at")),
                    resultSet.getString("b.blocked_reason"),
                    resultSet.getInt("blocks_amount"),
                    resultSet.getLong("c.board_column_id"),
                    resultSet.getString("bc.name")
                );
                return Optional.of(dto);
            }
        }
        return Optional.empty();
    }

}