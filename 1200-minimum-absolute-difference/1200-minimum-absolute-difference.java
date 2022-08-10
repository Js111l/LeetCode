class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {

        List<List<Integer>> res = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        Arrays.sort(arr);
        int minDiff=Integer.MAX_VALUE;
            for (int i=1;i<arr.length;i++) {
                            minDiff = Math.min(Math.abs(arr[i] - arr[i-1]), minDiff);

            }


        for (int i = 1; i < arr.length; i++) {
                if (Math.abs(arr[i] - arr[i-1]) == minDiff&&arr[i-1]<arr[i]) {
                    if(!list.contains(arr[i])&&!list.contains(arr[i-1])) {
                        list.add(arr[i-1]);
                        list.add(arr[i]);
                        res.add(list);
                        list = new ArrayList<>();
                    }
                }

        }
        return res;

    }
}


