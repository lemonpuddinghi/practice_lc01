/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public List<Integer> preorder1(Node root) {
        List<Integer> res = new ArrayList<>();

        if (root == null) {
            return res;
        }
        Deque<Node> stack = new LinkedList<Node>();
        stack.offerFirst(root);
        while (!stack.isEmpty()) {
            Node node = stack.pollFirst();
            res.add(node.val);
            Collections.reverse(node.children);
            for (Node child: node.children) {
                stack.offerFirst(child);
            }
        }
        return res;
    }
    public List<Integer> preorder(Node root) {
        List<Integer> res = new ArrayList<>();
        if (root == null) {
            return res;
        }
        postHelper(root, res);
        return res;
    }

    private void postHelper(Node root, List<Integer> res) {
        if (root == null) {
            return;
        }
        res.add(root.val);
        for (Node node: root.children) {
            postHelper(node, res);
        }
    }
}
// time: O(N)
// Space: O(N)