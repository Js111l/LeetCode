class Solution {
    public int findShortestSubArray(int[] nums) {

        int degree = 0;
        int size = 0;
        int res = 0;
        Map<Integer, Integer> counter = new HashMap<>();
        Map<Integer, Integer> first = new HashMap<>();
       
        for (int i = 0; i < nums.length; i++) {
            first.putIfAbsent(nums[i], i);

            counter.put(nums[i], counter.getOrDefault(nums[i], 0) + 1);
            if (counter.get(nums[i]) > degree) {
                degree = counter.get(nums[i]);
                res = i -             first.putIfAbsent(nums[i], i)+ 1;
            } else if (counter.get(nums[i]) == degree) {
                res = Math.min(res, i -             first.putIfAbsent(nums[i], i)+ 1);
            }
        }

        return res;
    }

}