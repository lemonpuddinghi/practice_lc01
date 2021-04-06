class Solution {
    public int largestUniqueNumber1(int[] A) {
        Arrays.sort(A);
        for (int i = A.length - 1; i > 0; i--) {
            if (i == 0 || A[i] != A[i-1]) {
                return A[i];
            }
            while (i > 0 && A[i] == A[i - 1]) {
                i--;
            }
        }
        return -1;
    }
    public int largestUniqueNumber(int[] A) {
        // using hashmap to store count
        // number: count
        Map<Integer, Integer> count = new HashMap<Integer, Integer>();
        for (int i: A) {
            count.put(i, count.getOrDefault(i, 0) + 1);
        }
        int result = -1;
        for (Map.Entry<Integer, Integer> entry: count.entrySet()) {
            if (entry.getValue() == 1) {
                result = Math.max(result, entry.getKey());
            }
        }
        return result;
    }
    // Time: O(N)
    //Space: O(N)
}