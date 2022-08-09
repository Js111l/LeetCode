class Solution {
    int indx;

    public boolean canJump(int[] nums) {
        int v=0;
    
    for(int i=0;i<=v;i++){
        v=Math.max(v,nums[i]+i);
        if(v>=nums.length-1){
            return true;
        }
    }
        return false;
    
    }

}



