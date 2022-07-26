class Solution {
    public int maximumWealth(int[][] accounts) {

        int res=0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<accounts.length;i++){
            res=0;
            for(int j=0;j<accounts[i].length;j++){
                res+=accounts[i][j];

            }
            max=Math.max(max,res);
            
        }
        
        return max;
    }
}

