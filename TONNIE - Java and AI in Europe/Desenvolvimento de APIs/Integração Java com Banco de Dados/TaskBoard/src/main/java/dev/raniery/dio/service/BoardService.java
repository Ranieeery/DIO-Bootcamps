package dev.raniery.dio.service;

import dev.raniery.dio.persistence.dao.BoardColumnDAO;
import dev.raniery.dio.persistence.dao.BoardDAO;
import dev.raniery.dio.persistence.entity.BoardColumnEntity;
import dev.raniery.dio.persistence.entity.BoardEntity;
import lombok.AllArgsConstructor;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

@AllArgsConstructor
public class BoardService {

    private final Connection connection;

    public void insert(final BoardEntity entity) throws SQLException {

        BoardDAO dao = new BoardDAO(connection);
        BoardColumnDAO boardColumnDAO = new BoardColumnDAO(connection);

        try {
            dao.insert(entity);
            List<BoardColumnEntity> columns = entity.getBoardColumns()
                .stream()
                .peek(c -> c.setBoard(entity)).toList();

            for (var column : columns) {
                boardColumnDAO.insert(column);
            }

            connection.commit();
        } catch (SQLException e) {
            connection.rollback();
            throw e;
        }
    }

    public boolean delete(final Long id) throws SQLException {

        BoardDAO dao = new BoardDAO(connection);

        try {
            if (!dao.exists(id)) {
                return false;
            }

            dao.delete(id);
            connection.commit();
            return true;
        } catch (SQLException e) {
            connection.rollback();
            throw e;
        }
    }
}