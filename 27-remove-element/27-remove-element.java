class Solution {
    public int removeElement(int[] nums, int val) {
        int j=0;
        for (int i=0;i<nums.length;i++){
            int v=nums[i];
            if(v!=val){
                nums[j]=v;
                j++;
            }
        }

        return j;
    }
}