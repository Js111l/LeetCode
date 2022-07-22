class Solution {
    public boolean isMonotonic(int[] nums) {
        
        int inc=0;
        int inc1=0;
        
        for(int i =1;i<nums.length;i++){
            
            if(nums[i]-nums[i-1]>=0){
                inc++;
            }
            if(nums[i-1]-nums[i]>=0){
                inc1++;
            }
            
        }
        
        return inc==nums.length-1 || inc1==nums.length-1;
        
    }
}