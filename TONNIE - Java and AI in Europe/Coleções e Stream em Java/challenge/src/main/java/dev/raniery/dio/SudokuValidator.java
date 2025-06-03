package dev.raniery.dio;

public class SudokuValidator {

    public static class ValidationResult {
        private final boolean valid;
        private final String errorMessage;

        public ValidationResult(boolean valid, String errorMessage) {
            this.valid = valid;
            this.errorMessage = errorMessage;
        }

        public boolean isValid() {
            return valid;
        }

        public String getErrorMessage() {
            return errorMessage;
        }

        public static ValidationResult success() {
            return new ValidationResult(true, null);
        }

        public static ValidationResult error(String message) {
            return new ValidationResult(false, message);
        }
    }

    public static ValidationResult validatePosition(int row, int col) {
        if (row < 0 || row >= 9 || col < 0 || col >= 9) {
            return ValidationResult.error("Posição inválida! Use índices de 0 a 8");
        }
        return ValidationResult.success();
    }

    public static ValidationResult validateNumber(int number) {
        if (number < 1 || number > 9) {
            return ValidationResult.error("Número inválido! Use números de 1 a 9");
        }
        return ValidationResult.success();
    }

    public static ValidationResult validatePlacement(SudokuBoard board, int row, int col, int number) {
        ValidationResult positionResult = validatePosition(row, col);
        if (!positionResult.isValid()) {
            return positionResult;
        }

        ValidationResult numberResult = validateNumber(number);
        if (!numberResult.isValid()) {
            return numberResult;
        }

        if (board.isFixed(row, col)) {
            return ValidationResult.error("Não é possível alterar um número fixo!");
        }

        if (board.hasNumber(row, col)) {
            return ValidationResult.error("Posição já ocupada! Remova o número primeiro.");
        }

        return ValidationResult.success();
    }

    public static ValidationResult validateRemoval(SudokuBoard board, int row, int col) {
        ValidationResult positionResult = validatePosition(row, col);
        if (!positionResult.isValid()) {
            return positionResult;
        }

        if (board.isFixed(row, col)) {
            return ValidationResult.error("Não é possível remover um número fixo!");
        }

        return ValidationResult.success();
    }

    public static int[] parseNumberPlacement(String input) throws NumberFormatException {
        if (input == null || input.trim().isEmpty()) {
            throw new NumberFormatException("Entrada vazia");
        }

        String[] parts = input.trim().split(",");
        if (parts.length != 3) {
            throw new NumberFormatException("Formato inválido! Use: número,linha,coluna");
        }

        return new int[] {
                Integer.parseInt(parts[0]), // number
                Integer.parseInt(parts[1]), // row
                Integer.parseInt(parts[2]) // col
        };
    }

    public static int[] parsePosition(String input) throws NumberFormatException {
        if (input == null || input.trim().isEmpty()) {
            throw new NumberFormatException("Entrada vazia");
        }

        String[] parts = input.trim().split(",");
        if (parts.length != 2) {
            throw new NumberFormatException("Formato inválido! Use: linha,coluna");
        }

        return new int[] {
                Integer.parseInt(parts[0]), // row
                Integer.parseInt(parts[1]) // col
        };
    }

    public static int[] parseInitialNumbers(String input) {
        if (input == null || input.trim().isEmpty()) {
            return new int[0];
        }

        String[] positions = input.trim().split("\\s+");
        return positions.length > 0 ? new int[positions.length * 3] : new int[0];
    }
}
