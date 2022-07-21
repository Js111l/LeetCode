class Solution {
    public int heightChecker(int[] heights) {
        int c=0;
        ArrayList<Integer>list=new ArrayList<>();
        Arrays.stream(heights).sorted().forEach(x->list.add(x));
        for (int i=0;i<heights.length;i++){
            if(heights[i]!=list.get(i)){
                c++;
            }
        }
        return c;
    }
}