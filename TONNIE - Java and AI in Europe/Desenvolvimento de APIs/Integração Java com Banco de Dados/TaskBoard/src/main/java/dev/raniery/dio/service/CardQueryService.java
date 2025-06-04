package dev.raniery.dio.service;

import dev.raniery.dio.dto.CardDetailsDTO;
import dev.raniery.dio.persistence.dao.CardDAO;
import lombok.AllArgsConstructor;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Optional;

@AllArgsConstructor
public class CardQueryService {

    private final Connection connection;

    public Optional<CardDetailsDTO> findById(final Long id) throws SQLException {

        CardDAO dao = new CardDAO(connection);
        return dao.findById(id);
    }

}
