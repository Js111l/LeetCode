class Solution {
    public int[] maxSubsequence(int[] nums, int k) {
        if(nums.length==k){
            return nums;
        }else {
            int[] nums2=nums.clone();
            Arrays.sort(nums2);
             for (Integer mn:nums
                 ) {
                System.out.println(mn);
            }
            List<Integer> numbers=new ArrayList<>();
            for (int i = 0; i < nums2.length-k; i++) {
                numbers.add(nums2[i]);
            }
            List<Integer> list=Arrays.stream(nums).mapToObj(x->Integer.valueOf(x)).collect(Collectors.toList());
            for (Integer num:numbers
                 ) {
                list.remove(num);
            }
            return list.stream().mapToInt(x->x).toArray();
        }
    }
}


