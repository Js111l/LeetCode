class Solution {
    public String longestPalindrome(String s) {
        StringBuilder stringBuilder;
        String res = "";
        for (int i = 0; i < s.length(); i++) {
            for (int j = s.length() - 1; j >= 0; j--) {
                String temp = s.substring(i, j + 1);
                if (j - i + 1 <= res.length()) {
                    break;
                }
                if (checkIfPalindrome(temp)) {
                    res = temp;
                }
            }
        }
        return res;
    }

    private boolean checkIfPalindrome(String temp) {

        for (int i = 0; i < Math.floor(temp.length() / 2); i++) {
            if (temp.charAt(i) != temp.charAt(temp.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }
}
