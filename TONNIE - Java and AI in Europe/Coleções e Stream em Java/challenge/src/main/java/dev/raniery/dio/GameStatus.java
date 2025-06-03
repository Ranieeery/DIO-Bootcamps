package dev.raniery.dio;

public enum GameStatus {
    NAO_INICIADO("Não Iniciado"),
    INCOMPLETO("Incompleto"),
    COMPLETO("Completo");

    private final String description;

    GameStatus(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
