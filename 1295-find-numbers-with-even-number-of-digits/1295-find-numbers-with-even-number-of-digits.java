class Solution {
    public int findNumbers(int[] nums) {
        return Math.toIntExact(Arrays.stream(nums).filter(x -> String.valueOf(x).length() % 2 == 0).count());
    }
}