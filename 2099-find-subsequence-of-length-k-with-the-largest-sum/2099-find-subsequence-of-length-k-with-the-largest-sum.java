class Solution {
    public int[] maxSubsequence(int[] nums, int k) {
        if (nums.length == k) {
            return nums;
        } else {
            int[] nums2 = nums.clone();
            Arrays.sort(nums2);
            List<Integer> list = Arrays.stream(nums).mapToObj(x -> Integer.valueOf(x)).collect(Collectors.toList());
            for (int i = 0; i < nums.length-k; i++) {
                list.remove(Integer.valueOf(nums2[i]));

            }
            return list.stream().mapToInt(x->x).toArray();
        }
    }
}
