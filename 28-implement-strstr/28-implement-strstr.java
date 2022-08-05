class Solution {
    int index=-1;
    public int strStr(String haystack, String needle) {

     if(needle.isEmpty()){
         return 0;
     }
     helper(haystack,needle,0);
     return index;
    }

    private void helper(String haystack, String needle, int i) {

        if(haystack.startsWith(needle)){
            index=i;
            return;
        }
        if(haystack.length()!=1){
        helper(haystack.substring(1),needle,i+1);
        }
        
    }
}


