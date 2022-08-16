class Solution {
    public String firstPalindrome(String[] words) {
        String res="";
        for (String x : words
        ) {
            if(new StringBuilder(x).reverse().toString().equals(x)){
                res=x;
                break;
            }
        }
        return res;
    }
}