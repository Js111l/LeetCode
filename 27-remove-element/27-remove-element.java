
class Solution {
    public int removeElement(int[] nums, int val) {
        int c=0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == val) {
                nums[i] = 0;
                c++;
            }
        }
        Arrays.sort(nums);

        for (int i = 0; i <nums.length/2 ; i++) {
            int temp=nums[i];
            nums[i]=nums[nums.length-i-1];
            nums[nums.length-i-1]=temp;
        }
        return nums.length-c;
    }
}