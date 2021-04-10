class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        dfs(res, 0, 0, n, new StringBuilder());
        return res;

    }
    private void dfs(List<String> res, int left, int right, int n, StringBuilder sb) {
        if (left >= n && right >= n) {
            res.add(sb.toString());
        }
        if (left < n) {
            sb.append("(");
            dfs(res, left + 1, right, n, sb);
            sb.deleteCharAt(sb.length() - 1);
        }
        if (right < left) {
            sb.append(")");
            dfs(res, left, right + 1, n, sb);
            sb.deleteCharAt(sb.length() - 1);
        }
    }
}