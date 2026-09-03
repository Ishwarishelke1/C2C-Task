import java.util.*;

public class solveNQueen {

    public static List<List<String>> solveNQueens(int n) {

        List<List<String>> result = new ArrayList<>();

        int[] board = new int[n];
        Arrays.fill(board, -1);

        backtrack(0, n, board, result);

        return result;
    }

    private static void backtrack(
            int row,
            int n,
            int[] board,
            List<List<String>> result) {

        // All queens placed
        if (row == n) {
            result.add(createBoard(board, n));
            return;
        }

        // Try every column
        for (int col = 0; col < n; col++) {

            if (isSafe(row, col, board)) {

                // Place queen
                board[row] = col;

                // Go to next row
                backtrack(row + 1, n, board, result);

                // Backtrack
                board[row] = -1;
            }
        }
    }

    private static boolean isSafe(
            int row,
            int col,
            int[] board) {

        for (int previousRow = 0;
             previousRow < row;
             previousRow++) {

            int previousCol = board[previousRow];

            // Same column
            if (previousCol == col) {
                return false;
            }

            // Same diagonal
            if (Math.abs(previousRow - row)
                    == Math.abs(previousCol - col)) {
                return false;
            }
        }

        return true;
    }

    private static List<String> createBoard(
            int[] board,
            int n) {

        List<String> configuration = new ArrayList<>();

        for (int row = 0; row < n; row++) {

            char[] currentRow = new char[n];

            Arrays.fill(currentRow, '.');

            currentRow[board[row]] = 'Q';

            configuration.add(new String(currentRow));
        }

        return configuration;
    }

    // MAIN METHOD
    public static void main(String[] args) {

        int n = 4;

        List<List<String>> result = solveNQueens(n);

        System.out.println(result);
    }
}