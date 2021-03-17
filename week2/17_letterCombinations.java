class Solution {
    private Map<Character, String> map = Map.of(
            '2', "abc", '3', "def", '4', "ghi", '5', "jkl",
            '6', "mno", '7', "pqrs", '8', "tuv", '9', "wxyz");
    private List<String> res = new ArrayList<>();
    private String phoneDigits;

    public List<String> letterCombinations(String digits) {
        if (digits == null || digits.length() < 1) {
            return res;
        }
        phoneDigits = digits;
        dfs(0, new StringBuilder());
        return res;
    }

    private void dfs(int index, StringBuilder path) {
        if (path.length() == phoneDigits.length()) {
            res.add(path.toString());
            return;
        }

        String possibleLetters = map.get(phoneDigits.charAt(index));
        for (char letter: possibleLetters.toCharArray()) {
            path.append(letter);
            dfs(index + 1, path);
            path.deleteCharAt(path.length() - 1);
        }
    }
}

//class Solution {
//    private HashMap<Integer, String> map = new HashMap<>();
//    public List<String> letterCombinations(String digits) {
//        List<String> res = new ArrayList<>();
//        if (digits == null || digits.length() < 1) {
//            return res;
//        }
//        map.put(2, "abc");
//        map.put(3, "def");
//        map.put(4, "ghi");
//        map.put(5, "jkl");
//        map.put(6, "mno");
//        map.put(7, "pqr");
//        map.put(8, "stuv");
//        map.put(9, "wxyz");
//
//        for (int i = 0; i < digits.length(); i++) {
//            String letters = map.get(digits.charAt(i));
//            dfs(res, digits, letters, 0, new StringBuilder());
//        }
//        return res;
//    }
//
//    private void dfs(List<String> res, String digits, String letters, int index, StringBuilder sb) {
//        if (sb.length() == digits) {
//            res.add(sb.toString());
//            return;
//        }
//        sb.append(letters.charAt(index));
//        dfs(res, digits, letters,index + 1, letters, sb);
//        sb.deleteAt(sb.length() - 1);
//    }
//}