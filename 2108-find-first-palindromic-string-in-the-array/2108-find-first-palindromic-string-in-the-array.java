class Solution {
    public String firstPalindrome(String[] words) {

        String res="";
        
        for (String x : words
        ) {
            StringBuilder sb=new StringBuilder(x);
            if(sb.reverse().toString().equals(x)){
                res=x;
                break;
            }
        }
        return res;
    }
}