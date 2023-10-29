package org.example.sudoku;

public class SudokuPuzzle {

    private static final int[][] DEFAULT_BOARD = new int[][] {
            {7, 0, 0, 0, 0, 0, 2, 0, 0},
            {4, 0, 2, 0, 0, 0, 0, 0, 3},
            {0, 0, 0, 2, 0, 1, 0, 0, 0},
            {3, 0, 0, 1, 8, 0, 0, 9, 7},
            {0, 0, 9, 0, 7, 0, 6, 0, 0},
            {6, 5, 0, 0, 3, 2, 0, 0, 1},
            {0, 0, 0, 4, 0, 9, 0, 0, 0},
            {5, 0, 0, 0, 0, 0, 1, 0, 6},
            {0, 0, 6, 0, 0, 0, 0, 0, 8}
    };

    private final int[][] board;

    /**
     * Constructor.
     * @param unsolved The unsolved sudoku board, with 0s for blanks.
     * @throws NullPointerException If <code>unsolved</code> is null.
     */
    public SudokuPuzzle(int[][] unsolved) {
        if (unsolved == null) {
            throw new NullPointerException("Unsolved board must not be null");
        }
        this.board = unsolved;
    }

    // Check if it's safe to place 'n' in the cell at row 'r' and column 'c'
    private boolean isSafe(int r, int c, int n) {
        // Check for clashes in the row
        for (int d = 0; d < this.board.length; d++) {
            if (board[r][d] == n) {
                return false;
            }
        }
        // Check for clashes in the column
        for (int r1 = 0; r1 < this.board.length; r1++) {
            if (this.board[r1][c] == n) {
                return false;
            }
        }
        // Check for clashes in the sub-grid
        int sqrt = (int) Math.sqrt(this.board.length);
        int boxRowStart = r - r % sqrt;
        int boxColStart = c - c % sqrt;
        for (int r1 = boxRowStart; r1 < boxRowStart + sqrt; r1++) {
            for (int d = boxColStart; d < boxColStart + sqrt; d++) {
                if (this.board[r1][d] == n) {
                    return false;
                }
            }
        }
        return true;
    }

    // Solve the Sudoku puzzle using backtracking
    public boolean solveSudoku(int num) {
        int r = -1;
        int c = -1;
        boolean isVacant = true;
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                if (this.board[i][j] == 0) {
                    r = i;
                    c = j;
                    isVacant = false;
                    break;
                }
            }
            if (!isVacant) {
                break;
            }
        }
        if (isVacant) {
            return true; // No empty cells left, the puzzle is solved
        }
        // Try placing numbers from 1 to num in the cell
        for (int no = 1; no <= num; no++) {
            if (this.isSafe(r, c, no)) {
                this.board[r][c] = no;
                if (this.solveSudoku(num)) {
                    return true;
                } else {
                    this.board[r][c] = 0; // Backtrack
                }
            }
        }
        return false; // No solution found for the current configuration
    }

    // Display the Sudoku grid
    public void display(int n) {
        for (int i = 0; i < n; i++) {
            for (int d = 0; d < n; d++) {
                System.out.print(this.board[i][d] + " ");
            }
            System.out.println();
            if ((i + 1) % (int) Math.sqrt(n) == 0) {
                System.out.println();
            }
        }
    }

    /**
     * Solves a sudoku puzzle.
     * @param args The puzzle to solve, in a single line, with zeroes instead of 
     * blanks, and a single space between each row if entered at the command 
     * line. For example, {"000450879", "010003502", "007000013", "200700004", 
     * "300060005", "960000027", "800120700", "700080040", "123647000"}. If left 
     * empty or if the board is not parsable, a default board will be 
     * substituted.
     */
    public static void main(String[] args) {
        int[][] board = DEFAULT_BOARD;
        if (args.length > 0) {
            try {
                board = SudokuParser.parseRows(args);
                System.out.println("Successfully parsed sudoku board");
            } catch (IllegalArgumentException iae) {
                System.err.println("Couldn't recognize parsable board");
                System.err.println(iae.getMessage());
                System.out.println("Substituting default board");
            }
        }
        SudokuPuzzle solver = new SudokuPuzzle(board);
        int size = board.length;
        System.out.println("The input grid is:");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        if (solver.solveSudoku(size)) {
            System.out.println("The solution to the Sudoku puzzle is:");
            solver.display(size);
        } else {
            System.out.println("There is no solution available.");
        }
    }

}
