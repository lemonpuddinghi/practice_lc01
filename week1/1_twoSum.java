class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int another = target - nums[i];
            if (map.containsKey(another)) {
                return new int[] {map.get(another), i};
            } else {
                map.put(nums[i], i);
            }
        }
        return new int[]{};
    }  
}
// Time: O(n)
// Space: O(n)
