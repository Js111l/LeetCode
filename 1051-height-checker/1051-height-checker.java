class Solution {
    public int heightChecker(int[] heights) {
        int c=0;
        int[]sort = Arrays.stream(heights).sorted().toArray();
        for (int i=0;i<heights.length;i++){
            if(heights[i]!=sort[i]){
                c++;
            }
        }
       return c; 
    }
}