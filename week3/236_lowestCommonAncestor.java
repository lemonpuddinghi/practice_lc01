class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        TreeNode res = null;
        dfs(root, p, q, res);
        return res;
    }

    private boolean dfs(TreeNode root, TreeNode p, TreeNode q, TreeNode res) {
        if (root == null) {
            return false;
        }
        TreeNode leftSon = dfs(cur.left, p, q);
        TreeNode rightSon = dfs(cur.right, p, q);
        if ((leftSon && rightSon && (cur == p || cur == q) ) || leftSon || rightSon) {
            res = root;
        }
        return leftSon || rightSon || (root.val == p.val || root.val == q.val);
    }

}