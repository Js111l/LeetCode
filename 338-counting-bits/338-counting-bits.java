class Solution {
    public int[] countBits(int n) {

        List<Integer> list=new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            int count=0;
            list.add(Integer.bitCount(i));
        }
        int [] arr=new int[n+1];
        for(int i=0;i<list.size();i++){
            arr[i]=list.get(i);
        }
        return arr;
    }
}