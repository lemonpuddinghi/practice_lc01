# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
from collections import deque

class Solution:
    def levelOrder1(self, root: TreeNode) -> List[List[int]]:
        res = []
        if not root:
            return res

        def helper(node, level):
            if len(res) == level:
                res.append([])

            res[level].append(node.val)

            if node.left:
                helper(node.left, level+1)
            if node.right:
                helper(node.right, level+1)

        helper(root, 0)
        return res

    def levelOrder(self, root: TreeNode) -> List[List[int]]:
        res = []
        if not root:
            return res
        level = 0
        quene = deque([root,])
        while quene:
            res.append([])
            level_length = len(quene)

            for i in range(level_length):
                node = quene.popleft()
                res[level].append(node.val)

                if node.left:
                    quene.append(node.left)
                if node.right:
                    quene.append(node.right)
            level += 1
        return res