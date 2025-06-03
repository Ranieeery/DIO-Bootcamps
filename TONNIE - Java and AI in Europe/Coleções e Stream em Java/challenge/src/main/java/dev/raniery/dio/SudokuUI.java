package dev.raniery.dio;

import javax.swing.JOptionPane;

public class SudokuUI {

    public static String getInitialNumbersInput() {
        return JOptionPane.showInputDialog(null,
                "Digite os números iniciais no formato: linha,coluna,número (separados por espaço)\n" +
                        "Exemplo: 0,0,5 0,2,3 1,1,8\n" +
                        "Deixe em branco para jogo com números aleatórios:");
    }

    public static String getNumberPlacementInput() {
        return JOptionPane.showInputDialog(null,
                "Digite: número,linha,coluna\nExemplo: 5,0,0");
    }

    public static String getNumberRemovalInput() {
        return JOptionPane.showInputDialog(null,
                "Digite: linha,coluna\nExemplo: 0,0");
    }

    public static void showMessage(String message) {
        JOptionPane.showMessageDialog(null, message);
    }

    public static int showDifficultyDialog() {
        String[] options = { "Fácil (35-40 números)", "Médio (28-32 números)", "Difícil (22-25 números)" };
        int choice = JOptionPane.showOptionDialog(null,
                "Escolha a dificuldade do jogo:",
                "Dificuldade",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                options,
                options[0]);

        return switch (choice) {
            case 0 -> 38; // Fácil
            case 1 -> 30; // Médio
            case 2 -> 24; // Difícil
            default -> 30; // Padrão médio
        };
    }

    public static boolean confirmAction(String message) {
        int result = JOptionPane.showConfirmDialog(null, message, "Confirmação",
                JOptionPane.YES_NO_OPTION);
        return result == JOptionPane.YES_OPTION;
    }
}
