class Solution {
    public int repeatedNTimes(int[] nums) {
        int n=nums.length/2;
        int result=0;
        Arrays.sort(nums);
        for(int i=1;i<nums.length;i++){
            if(nums[i-1]==nums[i]){
                return nums[i];
            }
        }
        return result;

    }
}