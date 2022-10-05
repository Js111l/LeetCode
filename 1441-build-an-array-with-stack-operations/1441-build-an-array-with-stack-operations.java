class Solution {
    public List<String> buildArray(int[] target, int n) {
        List<String> list1 = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if(i> target[target.length-1]){
                break;
            }
            if (Arrays.binarySearch(target,i)>=0){
                list1.add("Push");
            }else{
                list1.add("Push");
                list1.add("Pop");}
        }
        return list1;
    }
}