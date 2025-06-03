package dev.raniery.dio;

import java.util.HashSet;
import java.util.Set;

public class SudokuBoard {
    private int[][] board;
    private boolean[][] fixedNumbers;

    public SudokuBoard() {
        board = new int[9][9];
        fixedNumbers = new boolean[9][9];
    }

    public void reset() {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                board[i][j] = 0;
                fixedNumbers[i][j] = false;
            }
        }
    }

    public void setFixedNumber(int row, int col, int number) {
        if (isValidPosition(row, col) && isValidNumber(number)) {
            board[row][col] = number;
            fixedNumbers[row][col] = true;
        }
    }

    public void setUserNumber(int row, int col, int number) {
        if (isValidPosition(row, col) && isValidNumber(number) && !fixedNumbers[row][col]) {
            board[row][col] = number;
        }
    }

    public void removeNumber(int row, int col) {
        if (isValidPosition(row, col) && !fixedNumbers[row][col]) {
            board[row][col] = 0;
        }
    }

    public int getNumber(int row, int col) {
        if (isValidPosition(row, col)) {
            return board[row][col];
        }
        return 0;
    }

    public boolean isFixed(int row, int col) {
        if (isValidPosition(row, col)) {
            return fixedNumbers[row][col];
        }
        return false;
    }

    public boolean hasNumber(int row, int col) {
        return getNumber(row, col) != 0;
    }

    public boolean isComplete() {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j] == 0) {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean hasConflicts() {
        return hasRowConflicts() || hasColumnConflicts() || hasRegionConflicts();
    }

    private boolean hasRowConflicts() {
        for (int row = 0; row < 9; row++) {
            Set<Integer> seen = new HashSet<>();
            for (int col = 0; col < 9; col++) {
                int number = board[row][col];
                if (number != 0) {
                    if (seen.contains(number)) {
                        return true;
                    }
                    seen.add(number);
                }
            }
        }
        return false;
    }

    private boolean hasColumnConflicts() {
        for (int col = 0; col < 9; col++) {
            Set<Integer> seen = new HashSet<>();
            for (int row = 0; row < 9; row++) {
                int number = board[row][col];
                if (number != 0) {
                    if (seen.contains(number)) {
                        return true;
                    }
                    seen.add(number);
                }
            }
        }
        return false;
    }

    private boolean hasRegionConflicts() {
        for (int regionRow = 0; regionRow < 3; regionRow++) {
            for (int regionCol = 0; regionCol < 3; regionCol++) {
                if (hasRegionConflict(regionRow * 3, regionCol * 3)) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean hasRegionConflict(int startRow, int startCol) {
        Set<Integer> seen = new HashSet<>();
        for (int row = startRow; row < startRow + 3; row++) {
            for (int col = startCol; col < startCol + 3; col++) {
                int number = board[row][col];
                if (number != 0) {
                    if (seen.contains(number)) {
                        return true;
                    }
                    seen.add(number);
                }
            }
        }
        return false;
    }

    public void clearUserNumbers() {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (!fixedNumbers[i][j]) {
                    board[i][j] = 0;
                }
            }
        }
    }

    private boolean isValidPosition(int row, int col) {
        return row >= 0 && row < 9 && col >= 0 && col < 9;
    }

    private boolean isValidNumber(int number) {
        return number >= 1 && number <= 9;
    }
}
