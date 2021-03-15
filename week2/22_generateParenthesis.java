class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        StringBuilder temp = new StringBuilder();

        generateParenthesisHelper(res, n, 0, 0, temp);
        return res;

    }
    private void generateParenthesisHelper(List<String> res, int n, int left, int right, StringBuilder temp) {
        if (left == n && right == n) {
            res.add(temp.toString());
        }
        if (left < n) {
            generateParenthesisHelper(res, n, left+1, right, temp.append('('));
            temp.deleteCharAt(temp.length() - 1);
        }
        if (right < left) {
            generateParenthesisHelper(res, n, left, right+1, temp.append(')'));
            temp.deleteCharAt(temp.length() - 1);
        }
    }
}
//Time: ?
//Space:?
