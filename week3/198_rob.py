class Solution:
    def rob(self, nums: List[int]) -> int:
        if not nums or len(nums) < 0:
            return 0
        if len(nums) == 1:
            return nums[0]
        prepre, pre = nums[0], max(nums[0], nums[1])
        for i in nums[2:]:
            pre, prepre = max(prepre + i, pre), pre
        return pre