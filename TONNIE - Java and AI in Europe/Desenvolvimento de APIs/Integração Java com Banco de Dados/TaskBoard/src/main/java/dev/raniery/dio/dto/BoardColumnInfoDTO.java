package dev.raniery.dio.dto;

import dev.raniery.dio.persistence.entity.BoardColumnKindEnum;

public record BoardColumnInfoDTO(

    Long id,

    int order,

    BoardColumnKindEnum kind) {
}