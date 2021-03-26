/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    TreeNode res;
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        this.res = null;
        boolean r = dfs(root, p, q);
        return res;
    }

    private boolean dfs(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null) {
            return false;
        }
        boolean leftSon = dfs(root.left, p, q);
        boolean rightSon = dfs(root.right, p, q);
        if ((leftSon && rightSon && (root == p || root == q) ) || leftSon || rightSon) {
            this.res = root;
        }
        return leftSon || rightSon || (root.val == p.val || root.val == q.val);
    }

}

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution2 {

    TreeNode ans = null;

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        dfs(root, p, q);
        return this.ans;
    }

    private boolean dfs(TreeNode cur, TreeNode p, TreeNode q) {
        if (cur == null) {
            return false;
        }
        int left = dfs(cur.left, p, q) ? 1: 0;
        int right = dfs(cur.right, p, q) ? 1: 0;
        int mid = (cur == p || cur == q) ? 1: 0;

        if (mid + left + right >= 2) {
            this.ans = cur;
        }
        return (mid + left + right > 0);
    }
}