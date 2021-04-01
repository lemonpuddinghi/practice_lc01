class Solution {
    public boolean exist(char[][] board, String word) {
        if (board == null || board.length < 1) {
            return false;
        }
         for (int i = 0; i < board.length; i++) {
             for (int j = 0; j < board[0].length; j++) {
                 if (dfs(0, word, board, i, j)) {
                     return true;
                 }
             }
         }
        return false;
    }

    private boolean dfs (int pos, String word, char[][] board, int row, int column) {
        if (row == board.length || column == board[0].length || row < 0 || column < 0 || board[row][column] != word.charAt(pos)) {
            return false;
        }
        if (pos == word.length() - 1) {
            return true;
        }
        char c = board[row][column];
        board[row][column] = '#';

        boolean res = dfs(pos+1, word, board, row+1, column) ||
                dfs(pos+1, word, board, row, column+1) ||
                dfs(pos+1, word, board, row-1, column) ||
                dfs(pos+1, word, board, row, column-1);
        board[row][column] = c;

        return res;
    }
}