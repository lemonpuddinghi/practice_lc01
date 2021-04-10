class Solution {
    // S1 is better than S2, Because S2 use stack, Time: O(2N), While S1 use two pointer, O(N)
    public String reverseOnlyLetters(String S) {
        // S2: Using letter stack
        // Time: O(N), Space: O(N)
        Deque<Character> stack = new LinkedList<>();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < S.length(); i++) {
            if (Character.isLetter(S.charAt(i))) {
                stack.offerFirst(S.charAt(i));
            }
        }
        for (int i = 0; i < S.length(); i++) {
            if (Character.isLetter(S.charAt(i))) {
                sb.append(stack.pollFirst());
            }
            else {
                sb.append(S.charAt(i));
            }
        }
        return sb.toString();
    }

    public String reverseOnlyLetters1(String S) {
        // S1: Using two pointers
        // letter pointer from right
        // Time: O(N), Space: O(N)
        StringBuilder sb = new StringBuilder();
        int left = 0;
        int right = S.length() - 1;
        while (left < S.length()) {
            if (Character.isLetter(S.charAt(left))) {
                //find the letter from back
                while (!Character.isLetter(S.charAt(right))) {
                    right--;
                }
                sb.append(S.charAt(right));
                right--;
            }
            else {
                sb.append(S.charAt(left));
            }
            left++;
        }
        return sb.toString();
    }
}