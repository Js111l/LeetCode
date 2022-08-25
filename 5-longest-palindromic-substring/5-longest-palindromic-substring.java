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
      int low=0;
      int high=temp.length()-1;
        while(low<high){
            if(temp.charAt(low++)!=temp.charAt(high--)){
                return false;
            }
        }
        return true;
    }
}
