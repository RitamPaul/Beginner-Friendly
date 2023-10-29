package org.example.sudoku;

class SudokuParser {

    private static void verifyRowsWellFormed(String[] rows) {
        int colsInFirstRow = rows[0].length();
        int rowLen = rows.length;
        if (rowLen != colsInFirstRow) {
            String excMsg = "There are " + rowLen + " rows but first row has " 
                    + colsInFirstRow + " columns";
            throw new IllegalArgumentException(excMsg);
        }
        for (int i = 1; i < rowLen; i++) {
            int colsInRow = rows[i].length();
            if (colsInRow != colsInFirstRow) {
                String excMsg = "First row has " + colsInFirstRow 
                        + " columns but row " + (i + 1) + " has " + colsInRow 
                        + " columns";
                throw new IllegalArgumentException(excMsg);
            }
        }
    }

    static int[][] parseRows(String[] rows) {
        verifyRowsWellFormed(rows);
        int size = rows.length;
        int[][] board = new int[size][size];
        for (int r = 0; r < size; r++) {
            char[] columns = rows[r].toCharArray();
            for (int c = 0; c < size; c++) {
                char col = columns[c];
                if (Character.isDigit(col)) {
                    board[r][c] = col - 48;
                } else {
                    String excMsg = "Character '" + col + "' at row " + (r + 1) 
                            + ", column " + (c + 1) 
                            + " is not a digit as expected";
                    throw new NumberFormatException(excMsg);
                }
            }
        }
        return board;
    }

}
