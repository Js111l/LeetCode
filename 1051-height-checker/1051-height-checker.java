class Solution {
    public int heightChecker(int[] heights) {
        int c=0;
        
        for (int i=0;i<heights.length;i++){
            if(heights[i]!=Arrays.stream(heights).sorted().toArray()[i]){
                c++;
            }
        }
       return c;
    }
}