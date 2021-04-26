
class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<Integer> cur = new ArrayList<>();
        List<List<String>> res = new ArrayList<List<String>>();
        helper(n, cur, res);
        return res;
    }

    private void helper(int n, List<Integer> cur, List<List<String>> res) {
        // cur: index is the row, value is the column
        if (n == cur.size()) {
            addSolution(new ArrayList<Integer>(cur), res, n);
            return;
        }
        for (int i = 0; i < n; i++) {
            if (valid(cur, i)) {
                cur.add(i);
                helper(n, cur, res);
                cur.remove(cur.size() - 1);
            }
        }
    }

    private boolean valid(List<Integer> cur, int column) {
        int row = cur.size();
        for (int i = 0; i < row; i++) {
            if (cur.get(i) == column || Math.abs(cur.get(i) - column) == (row - i)) {
                return false;
            }
        }
        return true;
    }
    private void addSolution(List<Integer> cur, List<List<String>> res, int n) {
        List<String> solution = new ArrayList<String>();
        for (int i = 0; i < n; i++) {
            int col = cur.get(i);
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < col; j++) {
                sb.append(".");
            }
            sb.append("Q");
            for (int j = 0; j < n - col - 1; j++) {
                sb.append(".");
            }
            solution.add(sb.toString());
        }
        res.add(solution);
    }
}