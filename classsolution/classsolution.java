class Solution {
    public boolean exist(char[][] board, String word) {
        if (board == null || board.length == 0 || word == null) {
            return false;
        }

        int rows = board.length;
        int cols = board[0].length;

        // Try starting DFS from every cell
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (dfs(board, word, i, j, 0)) {
                    return true;
                }
            }
        }
        return false;
    }

    // DFS helper with backtracking
    private boolean dfs(char[][] board, String word, int row, int col, int index) {
        // If all characters are matched
        if (index == word.length()) {
            return true;
        }

        // Boundary and character check
        if (row < 0 || row >= board.length || col < 0 || col >= board[0].length
                || board[row][col] != word.charAt(index)) {
            return false;
        }

        // Mark the cell as visited by temporarily changing its value
        char temp = board[row][col];
        board[row][col] = '#';

        // Explore all 4 directions
        boolean found = dfs(board, word, row + 1, col, index + 1) ||
                        dfs(board, word, row - 1, col, index + 1) ||
                        dfs(board, word, row, col + 1, index + 1) ||
                        dfs(board, word, row, col - 1, index + 1);

        // Restore the cell value (backtrack)
        board[row][col] = temp;

        return found;
    }
}