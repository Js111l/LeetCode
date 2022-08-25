class Solution {
    public String longestPalindrome(String s) {
        String ans = "";
        
        for(int i = 0; i < s.length(); i++) {
            for(int j = s.length() - 1; j >= 0; j--) {
                if(j - i + 1 <= ans.length()) break;                
                if(isPalindrome(s, i, j)) {        
                    ans = s.substring(i, j + 1);
                } 
            }
        }
        
        return ans;
    }
    
    private boolean isPalindrome(String s, int start, int end) {   
        while(start < end) {
            if(s.charAt(start++) != s.charAt(end--)) return false;
        }
        
        return true;
    }
}