class Solution {

    int m, n;
    char[][] grid;
    Boolean[][][] memo;

    public boolean hasValidPath(char[][] grid) {

        this.grid = grid;
        m = grid.length;
        n = grid[0].length;

        // Every path has m + n - 1 characters.
        // A valid parentheses string must have even length.
        if ((m + n - 1) % 2 != 0) {
            return false;
        }

        // First character must be '('
        if (grid[0][0] == ')') {
            return false;
        }

        memo = new Boolean[m][n][m + n];

        return dfs(0, 0, 1);
    }

    private boolean dfs(int row, int col, int balance) {

        // Invalid balance
        if (balance < 0) {
            return false;
        }

        // Not enough remaining cells to close all '('
        int remaining = (m - 1 - row) + (n - 1 - col);

        if (balance > remaining) {
            return false;
        }

        // Destination
        if (row == m - 1 && col == n - 1) {
            return balance == 0;
        }

        // Already calculated
        if (memo[row][col][balance] != null) {
            return memo[row][col][balance];
        }

        boolean possible = false;

        // Move down
        if (row + 1 < m) {

            int newBalance = balance;

            if (grid[row + 1][col] == '(') {
                newBalance++;
            } else {
                newBalance--;
            }

            possible = dfs(row + 1, col, newBalance);
        }

        // Move right
        if (!possible && col + 1 < n) {

            int newBalance = balance;

            if (grid[row][col + 1] == '(') {
                newBalance++;
            } else {
                newBalance--;
            }

            possible = dfs(row, col + 1, newBalance);
        }

        memo[row][col][balance] = possible;

        return possible;
    }
}