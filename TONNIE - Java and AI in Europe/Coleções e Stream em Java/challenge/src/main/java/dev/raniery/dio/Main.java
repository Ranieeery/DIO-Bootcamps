package dev.raniery.dio;

import javax.swing.SwingUtilities;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            SudokuGame game = new SudokuGame();
            game.setVisible(true);
        });
    }
}