class Solution {
    public int[] diStringMatch(String s) {

        int max=s.length();

        int low=0;
        int [] res=new int[s.length()+1];
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='I'){
                res[i]=low;
                low++;
            }
            else{
                res[i]=max--;
            }
        }
        //insert last element
        res[s.length()]=low++;
        return res;
    }
}
