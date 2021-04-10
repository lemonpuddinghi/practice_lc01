class Solution:
    def relativeSortArray(self, arr1: List[int], arr2: List[int]) -> List[int]:
        upper = max(arr1)
        frequence = [0] * (upper + 1)
        for x in arr1:
            frequence[x] += 1
        ans = list()
        for x in arr2:
            ans.extend([x]*frequence[x])
            frequence[x] = 0
        for x in range(upper + 1):
            if frequence[x] > 0:
                ans.extend([x] * frequence[x])
        return ans