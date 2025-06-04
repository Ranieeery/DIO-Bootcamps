package dev.raniery.dio.service;

import dev.raniery.dio.persistence.dao.BoardColumnDAO;
import dev.raniery.dio.persistence.entity.BoardColumnEntity;
import lombok.AllArgsConstructor;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Optional;

@AllArgsConstructor
public class BoardColumnQueryService {

    private final Connection connection;

    public Optional<BoardColumnEntity> findById(final Long id) throws SQLException {

        BoardColumnDAO dao = new BoardColumnDAO(connection);
        return dao.findById(id);
    }

}