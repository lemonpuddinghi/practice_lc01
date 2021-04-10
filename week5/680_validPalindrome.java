class Solution {
    public static boolean validPalindrome(String s) {
        if (s == null || s.length() <= 1) {
            return true;
        }
        char[] str = s.toCharArray();
        int left = 0, right = str.length - 1;
        int flag = 0;
        while (left < right) {
            if (str[left] != str[right] && flag != 0) {
                return false;
            }
            if (str[left] != str[right] && flag == 0) {
                if (str[left+1] == str[right]) {
                    left++;
                    flag = 1;
                } else if (str[right-1] == str[left]) {
                    right--;
                    flag = 1;
                } else {
                    return false;
                }
            }
            else if (str[left] == str[right]) {
                left++;
                right--;
            }
        }
        return true;
    }
    public static void main() {
        s = "puufxoohdfpgjdmysgvhmvffcnqxjjxqncffvmhvgsymdjgpfdhooxfuupu";
        validPalindrome(s);
    }
}