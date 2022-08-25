class Solution {
    public String longestPalindrome(String s) {
        StringBuilder stringBuilder;
        String res = "";
        for (int i = 0; i < s.length(); i++) {
            for (int j = s.length() - 1; j >= 0; j--) {
                if (j - i + 1 <= res.length()) {
                    break;
                }
                if (checkIfPalindrome(s,i,j)) {
                    res = s.substring(i, j + 1);
                }
            }
        }
        return res;
    }
    private boolean checkIfPalindrome(String temp,int low,int high) {
      int first=low;
      int last=high;
        while(first<last){
            if(temp.charAt(first++)!=temp.charAt(last--)){
                return false;
            }
        }
        return true;
    }
}
