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
                if (checkIfPalindrome(s,i,j)) {
                    res = temp;
                }
            }
        }
        return res;
    }

    private boolean checkIfPalindrome(String temp,int i,int j) {
        while(i<j){
            if(temp.charAt(i++)!=temp.charAt(j--)){
                return false;
            }
        }
        
        return true;
    }
}
