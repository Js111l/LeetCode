class Solution {
    public boolean isPalindrome(int x) {
        
        String s=String.valueOf(x);
        StringBuilder backwards=new StringBuilder();
        for(int i=s.length()-1;i>=0;i--){
            backwards.append(s.charAt(i));
        }
        
        if(backwards.toString().equals(s)){
            return true;
        }
        return false;
        
        
    }
}