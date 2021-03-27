# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution:

    def __init__(self):
        self.ans = None
    def lowestCommonAncestor(self, root: 'TreeNode', p: 'TreeNode', q: 'TreeNode') -> 'TreeNode':

        def dfs(cur):
            if not cur:
                return False

            left = dfs(cur.left)
            right = dfs(cur.right)
            mid = cur == p or cur == q

            if mid + left + right >= 2:
                self.ans = cur
            return mid or left or right

        dfs(root)
        return self.ans

#     Time: O(N)
#     Space:O(N)

