package dev.raniery.dio;

import java.util.*;

public class SudokuGenerator {
    private static final Random random = new Random();

    public static int[][] generateRandomSudoku(int filledCells) {
        int[][] grid = new int[9][9];

        fillDiagonalBoxes(grid);
        solveSudoku(grid);
        removeCells(grid, 81 - filledCells);

        return grid;
    }

    private static void fillDiagonalBoxes(int[][] grid) {
        for (int box = 0; box < 9; box += 3) {
            fillBox(grid, box, box);
        }
    }

    private static void fillBox(int[][] grid, int startRow, int startCol) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        Collections.shuffle(numbers);

        int index = 0;
        for (int row = startRow; row < startRow + 3; row++) {
            for (int col = startCol; col < startCol + 3; col++) {
                grid[row][col] = numbers.get(index++);
            }
        }
    }

    private static boolean solveSudoku(int[][] grid) {
        for (int row = 0; row < 9; row++) {
            for (int col = 0; col < 9; col++) {
                if (grid[row][col] == 0) {
                    for (int num = 1; num <= 9; num++) {
                        if (isValidPlacement(grid, row, col, num)) {
                            grid[row][col] = num;
                            if (solveSudoku(grid)) {
                                return true;
                            }
                            grid[row][col] = 0;
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }

    private static boolean isValidPlacement(int[][] grid, int row, int col, int num) {
        for (int i = 0; i < 9; i++) {
            if (grid[row][i] == num || grid[i][col] == num) {
                return false;
            }
        }

        int boxRow = (row / 3) * 3;
        int boxCol = (col / 3) * 3;
        for (int i = boxRow; i < boxRow + 3; i++) {
            for (int j = boxCol; j < boxCol + 3; j++) {
                if (grid[i][j] == num) {
                    return false;
                }
            }
        }

        return true;
    }

    private static void removeCells(int[][] grid, int cellsToRemove) {
        Set<String> removedPositions = new HashSet<>();

        while (removedPositions.size() < cellsToRemove) {
            int row = random.nextInt(9);
            int col = random.nextInt(9);
            String position = row + "," + col;

            if (!removedPositions.contains(position) && grid[row][col] != 0) {
                grid[row][col] = 0;
                removedPositions.add(position);
            }
        }
    }

    public static int[][] getExampleSudoku() {
        return new int[][] {
                { 5, 3, 0, 0, 7, 0, 0, 0, 0 },
                { 6, 0, 0, 1, 9, 5, 0, 0, 0 },
                { 0, 9, 8, 0, 0, 0, 0, 6, 0 },
                { 8, 0, 0, 0, 6, 0, 0, 0, 3 },
                { 4, 0, 0, 8, 0, 3, 0, 0, 1 },
                { 7, 0, 0, 0, 2, 0, 0, 0, 6 },
                { 0, 6, 0, 0, 0, 0, 2, 8, 0 },
                { 0, 0, 0, 4, 1, 9, 0, 0, 5 },
                { 0, 0, 0, 0, 8, 0, 0, 7, 9 }
        };
    }

    public static boolean solveSudokuPublic(int[][] grid) {
        return solveSudoku(grid);
    }
}
