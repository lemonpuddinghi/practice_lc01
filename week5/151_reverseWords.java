//逐个反转字符串中的每一个单词
class Solution {
    public String reverseWords(String s) {
        if (s.length() <= 1) {
            return s;
        }
        char[] str = s.toCharArray();
        int left = 0;
        int right = str.length - 1;
        while (left <= right && s.charAt(left) == ' ') {
            left++;
        }
        while (right >= 0 && s.charAt(right) == ' ') {
            right--;
        }
        StringBuilder sb = new StringBuilder();
        while (left <= right) {
            char c = s.charA();
        }

        reverseHelper(str, 0, str.length - 1);

        int cur = 0;
        while (cur < str.length) {
            if () {

            }
        }

    }
    private void reverseHelper(char[] str, int start, int end) {
        while (start < end) {
            char temp = str[start];
            str[start] = str[end];
            str[end] = temp;
            start++;
            end--;
        }
    }
}