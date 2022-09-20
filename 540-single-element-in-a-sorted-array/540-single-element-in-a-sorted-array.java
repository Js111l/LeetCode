
class Solution {
    public int singleNonDuplicate(int[] nums) {
        if(nums.length==1){
            return nums[0];
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != nums[i + 1]) {
                return nums[i];
            }else {
                i++;
            }
             if(i==nums.length-2&&nums[i]!=nums[i+1]){
                return nums[i+1];
            }
        }
        return -1;
    }
}
