class Solution:
    def climbStairs(self, n: int) -> int:
        if n <= 2:
            return n
        step0, step1, step2 = 0, 1, 2

        for i in range(n):
            step2 = step0 + step1
            step0, step1 = step1,step2
        return step2