class Solution {
    public int minPathSum(int[][] grid){
        if (grid == null || grid.length < 1 || grid[0] == null || grid[0].length < 1 ) {
            return 0;
        }

        int row = grid.length;
        int column = grid[0].length;
        int[][] M = new int[row][column];
        M[0][0] = grid[0][0];
        for (int i = 1; i < row; i++) {
            M[i][0] = M[i-1][0] + grid[i][0];
        }
        for (int i = 1; i < column; i++) {
            M[0][i] = M[0][i- 1] + grid[0][i];
        }
        for (int i = 1; i < row; i++) {
            for (int j = 1; j < column; j++) {
                M[i][j] = Math.min(M[i-1][j], M[i][j-1]) + grid[i][j];
            }
        }
        return M[row - 1][column - 1];

    }

    public int minPathSum1(int[][] grid) {
        if (grid == null || grid.length < 1 || grid[0] == null || grid[0].length < 1 ) {
            return 0;
        }
        if (grid[0].length < 2) {
            return grid[0][0];
        }

        int row = grid.length;
        int column = grid[0].length;
        int[][] M = new int[row][column];

        for (int i = 0; i < row; i++) {

            for (int j = 0; j < column; j++) {
                if (i == 0 && j == 0) {
                    M[i][j] = grid[0][0];
                }
                else if (j == 0) {
                    M[i][j] = M[i-1][0] + grid[i][0];
                }
                else if (i == 0) {
                    M[i][j] = M[0][j - 1] + grid[0][j];
                }
                else {
                    M[i][j] = Math.min(M[i-1][j], M[i][j-1]) + grid[i][j];
                }
            }
        }
        return M[row-1][column-1];
    }
}

// Time: O(M*N)
// Space: o(M*N)