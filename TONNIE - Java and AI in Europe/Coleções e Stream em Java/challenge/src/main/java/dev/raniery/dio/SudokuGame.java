package dev.raniery.dio;

import javax.swing.*;
import java.awt.*;

public class SudokuGame extends JFrame {
    private SudokuBoard board;
    private JPanel gridPanel;
    private JTextField[][] textFields;
    private JLabel statusLabel;
    private GameStatus gameStatus;

    public SudokuGame() {
        board = new SudokuBoard();
        gameStatus = GameStatus.NAO_INICIADO;
        initializeUI();
    }

    private void initializeUI() {
        setTitle("Jogo de Sudoku");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        createMenuBar();
        createGamePanel();
        createStatusPanel();

        pack();
        setLocationRelativeTo(null);
        setResizable(false);
    }

    @SuppressWarnings("unused")
    private void createMenuBar() {
        JMenuBar menuBar = new JMenuBar();
        JMenu gameMenu = new JMenu("Jogo");

        JMenuItem newGame = new JMenuItem("1. Iniciar Novo Jogo");
        JMenuItem placeNumber = new JMenuItem("2. Colocar Número");
        JMenuItem removeNumber = new JMenuItem("3. Remover Número");
        JMenuItem viewGame = new JMenuItem("4. Verificar Jogo");
        JMenuItem checkStatus = new JMenuItem("5. Verificar Status");
        JMenuItem clearGame = new JMenuItem("6. Limpar");
        JMenuItem finishGame = new JMenuItem("7. Finalizar Jogo");

        newGame.addActionListener(e -> startNewGame());
        placeNumber.addActionListener(e -> placeNumber());
        removeNumber.addActionListener(e -> removeNumber());
        viewGame.addActionListener(e -> refreshBoard());
        checkStatus.addActionListener(e -> checkGameStatus());
        clearGame.addActionListener(e -> clearUserNumbers());
        finishGame.addActionListener(e -> finishGame());

        gameMenu.add(newGame);
        gameMenu.add(placeNumber);
        gameMenu.add(removeNumber);
        gameMenu.add(viewGame);
        gameMenu.add(checkStatus);
        gameMenu.add(clearGame);
        gameMenu.add(finishGame);

        menuBar.add(gameMenu);
        setJMenuBar(menuBar);
    }

    @SuppressWarnings("unused")
    private void createGamePanel() {
        gridPanel = new JPanel(new GridLayout(9, 9, 2, 2));
        gridPanel.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createRaisedBevelBorder(),
                BorderFactory.createEmptyBorder(10, 10, 10, 10)));
        gridPanel.setBackground(Color.BLACK);

        textFields = new JTextField[9][9];

        for (int row = 0; row < 9; row++) {
            for (int col = 0; col < 9; col++) {
                JTextField field = new JTextField();
                field.setHorizontalAlignment(JTextField.CENTER);
                field.setFont(new Font("Arial", Font.BOLD, 20));
                field.setPreferredSize(new Dimension(50, 50));

                Color bgColor = getRegionColor(row, col);
                field.setBackground(bgColor);

                final int r = row;
                final int c = col;

                field.addActionListener(e -> {
                    String text = field.getText().trim();
                    if (!text.isEmpty()) {
                        try {
                            int number = Integer.parseInt(text);
                            if (number >= 1 && number <= 9) {
                                placeNumberAt(r, c, number);
                            } else {
                                field.setText("");
                                showMessage("Digite apenas números de 1 a 9");
                            }
                        } catch (NumberFormatException ex) {
                            field.setText("");
                            showMessage("Digite apenas números de 1 a 9");
                        }
                    }
                });

                textFields[row][col] = field;
                gridPanel.add(field);
            }
        }

        add(gridPanel, BorderLayout.CENTER);
    }

    private Color getRegionColor(int row, int col) {
        int regionRow = row / 3;
        int regionCol = col / 3;
        boolean isDarkRegion = (regionRow + regionCol) % 2 == 0;
        return isDarkRegion ? new Color(173, 216, 230) : Color.WHITE;
    }

    private void createStatusPanel() {
        JPanel statusPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        statusLabel = new JLabel("Status: Não Iniciado");
        statusLabel.setFont(new Font("Arial", Font.BOLD, 14));
        statusPanel.add(statusLabel);
        add(statusPanel, BorderLayout.SOUTH);
    }

    private void startNewGame() {
        int filledCells = SudokuUI.showDifficultyDialog();
        int[][] randomSudoku = SudokuGenerator.generateRandomSudoku(filledCells);

        board.reset();
        loadSudokuFromArray(randomSudoku);

        gameStatus = GameStatus.INCOMPLETO;
        refreshBoard();
        updateStatus();
        SudokuUI.showMessage("Novo jogo iniciado!");
    }

    private void loadSudokuFromArray(int[][] sudokuArray) {
        for (int row = 0; row < 9; row++) {
            for (int col = 0; col < 9; col++) {
                if (sudokuArray[row][col] != 0) {
                    board.setFixedNumber(row, col, sudokuArray[row][col]);
                }
            }
        }
    }

    private void placeNumber() {
        if (gameStatus == GameStatus.NAO_INICIADO) {
            SudokuUI.showMessage("Inicie um novo jogo primeiro!");
            return;
        }

        String input = SudokuUI.getNumberPlacementInput();
        if (input != null && !input.trim().isEmpty()) {
            try {
                int[] values = SudokuValidator.parseNumberPlacement(input);
                int number = values[0];
                int row = values[1];
                int col = values[2];

                placeNumberAt(row, col, number);
            } catch (NumberFormatException e) {
                SudokuUI.showMessage("Formato inválido! Use: número,linha,coluna");
            }
        }
    }

    private void placeNumberAt(int row, int col, int number) {
        SudokuValidator.ValidationResult result = SudokuValidator.validatePlacement(board, row, col, number);

        if (!result.isValid()) {
            SudokuUI.showMessage(result.getErrorMessage());
            return;
        }

        board.setUserNumber(row, col, number);
        refreshBoard();
        updateStatus();
    }

    private void removeNumber() {
        if (gameStatus == GameStatus.NAO_INICIADO) {
            SudokuUI.showMessage("Inicie um novo jogo primeiro!");
            return;
        }

        String input = SudokuUI.getNumberRemovalInput();
        if (input != null && !input.trim().isEmpty()) {
            try {
                int[] values = SudokuValidator.parsePosition(input);
                int row = values[0];
                int col = values[1];

                SudokuValidator.ValidationResult result = SudokuValidator.validateRemoval(board, row, col);

                if (!result.isValid()) {
                    SudokuUI.showMessage(result.getErrorMessage());
                    return;
                }

                board.removeNumber(row, col);
                refreshBoard();
                updateStatus();
                SudokuUI.showMessage("Número removido!");
            } catch (NumberFormatException e) {
                SudokuUI.showMessage("Formato inválido! Use: linha,coluna");
            }
        }
    }

    private void refreshBoard() {
        for (int row = 0; row < 9; row++) {
            for (int col = 0; col < 9; col++) {
                JTextField field = textFields[row][col];
                int number = board.getNumber(row, col);

                if (number == 0) {
                    field.setText("");
                    field.setEditable(true);
                    field.setForeground(Color.BLUE);
                } else {
                    field.setText(String.valueOf(number));
                    if (board.isFixed(row, col)) {
                        field.setEditable(false);
                        field.setForeground(Color.BLACK);
                        field.setFont(new Font("Arial", Font.BOLD, 20));
                    } else {
                        field.setEditable(true);
                        field.setForeground(Color.BLUE);
                        field.setFont(new Font("Arial", Font.PLAIN, 20));
                    }
                }
            }
        }
    }

    private void checkGameStatus() {
        updateStatus();
        boolean hasErrors = board.hasConflicts();
        String errorStatus = hasErrors ? "com erros" : "sem erros";

        String message = String.format("Status: %s (%s)", gameStatus.getDescription(), errorStatus);
        SudokuUI.showMessage(message);
    }

    private void updateStatus() {
        if (gameStatus != GameStatus.NAO_INICIADO) {
            if (board.isComplete()) {
                gameStatus = GameStatus.COMPLETO;
            } else {
                gameStatus = GameStatus.INCOMPLETO;
            }
        }

        boolean hasErrors = board.hasConflicts();
        String errorStatus = hasErrors ? " (com erros)" : " (sem erros)";
        statusLabel.setText("Status: " + gameStatus.getDescription() + errorStatus);
    }

    private void clearUserNumbers() {
        if (gameStatus == GameStatus.NAO_INICIADO) {
            SudokuUI.showMessage("Inicie um novo jogo primeiro!");
            return;
        }

        if (SudokuUI.confirmAction("Tem certeza que deseja limpar todos os números inseridos?")) {
            board.clearUserNumbers();
            refreshBoard();
            updateStatus();
            SudokuUI.showMessage("Números do usuário removidos!");
        }
    }

    private void finishGame() {
        if (gameStatus == GameStatus.NAO_INICIADO) {
            SudokuUI.showMessage("Inicie um novo jogo primeiro!");
            return;
        }

        if (board.isComplete() && !board.hasConflicts()) {
            SudokuUI.showMessage("Parabéns! Jogo concluído com sucesso!");
            gameStatus = GameStatus.NAO_INICIADO;
            updateStatus();
        } else if (!board.isComplete()) {
            if (SudokuUI.confirmAction("O jogo está incompleto. Deseja ver a solução?")) {
                showSolution();
                SudokuUI.showMessage("Solução exibida! O jogo foi finalizado.");
                gameStatus = GameStatus.NAO_INICIADO;
                updateStatus();
            }
        } else {
            SudokuUI.showMessage("Corrija os erros antes de finalizar o jogo!");
        }
    }

    private void showMessage(String message) {
        SudokuUI.showMessage(message);
    }

    private void showSolution() {
        int[][] currentBoard = new int[9][9];
        for (int row = 0; row < 9; row++) {
            for (int col = 0; col < 9; col++) {
                currentBoard[row][col] = board.getNumber(row, col);
            }
        }

        if (SudokuGenerator.solveSudokuPublic(currentBoard)) {
            for (int row = 0; row < 9; row++) {
                for (int col = 0; col < 9; col++) {
                    if (board.getNumber(row, col) == 0) {
                        board.setUserNumber(row, col, currentBoard[row][col]);
                    }
                }
            }
            refreshBoard();
        } else {
            SudokuUI.showMessage("Não foi possível resolver este Sudoku!");
        }
    }
}
