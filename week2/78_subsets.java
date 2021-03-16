class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        // DFS
        // 3 levels, each level is each position(elements) of nums
        List<Integer> temp = new ArrayList<Integer>();
        List<List<Integer>> res = new ArrayList<List<Integer>>();

        subsetsHelper(nums, 0, res, temp);
        return res;
    }

    private void subsetsHelper(int[] nums, int index, List<List<Integer>> res, List<Integer> temp) {
        if (index == nums.length) {
            res.add(new ArrayList<Integer>(temp));
            return;
        }
        // not add nums[index]
        temp.add(nums[index]);
        subsetsHelper(nums, index + 1, res, temp);
        temp.remove(temp.size() - 1);

        subsetsHelper(nums, index + 1, res, temp);
        // recover status
    }
}