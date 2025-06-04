package dev.raniery.dio.dto;


import dev.raniery.dio.persistence.entity.BoardColumnKindEnum;

public record BoardColumnDTO(

    Long id,

    String name,

    BoardColumnKindEnum kind,

    int cardsAmount) {
}