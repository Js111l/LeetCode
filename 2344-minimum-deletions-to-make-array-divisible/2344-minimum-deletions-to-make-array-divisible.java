class Solution {
    public int minOperations(int[] nums, int[] numsDivide) {

        Arrays.sort(nums);
        int temp=numsDivide[0];
        for (int i = 1; i < numsDivide.length; i++) {
            temp=gcd(temp,numsDivide[i]);
        }
        for(int i=0;i<nums.length;i++){
            if(temp%nums[i]==0)return i;
        }
        return -1;

    }

    int gcd(int a, int b) {
        if (b % a == 0) return a;
        return gcd(b % a, a);
    }

}