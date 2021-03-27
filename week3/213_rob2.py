class Solution:
    def rob(self, nums: List[int]) -> int:
        # 2 round rob
        # round1: nums[0] not: nums[1: n+1)
        # round2: nums[1] not: nums[0: n)
        def robHelper(nums: List[int]):
            if not nums or len(nums) < 1:
                return 0
            if len(nums) == 1:
                return nums[0]
            prepre, pre = nums[0], max(nums[0], nums[1])
            for i in nums[2:]:
                prepre, pre = pre, max(prepre+i, pre)
            return pre

        if not nums or len(nums) < 1:
            return 0
        if len(nums) == 1:
            return nums[0]
        rob0 = robHelper(nums[1:])
        rob1 = robHelper(nums[0: -1])

        return max(rob0, rob1)
# Time: O(N)
# Space: O(N)