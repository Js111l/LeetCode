class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        int i = num.length;
        int cur=k;
       
        while (--i>=0||cur>0){
            if(i>=0) {
                cur += num[i];
            }
            arr.add(cur%10);
                cur = cur / 10;
        }
        Collections.reverse(arr);
        return arr;
    }
}