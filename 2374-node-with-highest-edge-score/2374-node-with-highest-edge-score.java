class Solution {
    public int edgeScore(int[] edges) {

        long[] nodes= new long[edges.length];
        int indexOfMax=Integer.MIN_VALUE;
        for (int i = 0; i < edges.length; i++) {
            nodes[edges[i]]+=i;
        }
        long max=Long.MIN_VALUE;
        max=maxValue(nodes);
        for (int i = 0; i <edges.length ; i++) {
            if(nodes[i]==max){
                indexOfMax=i;
                break;
            }
        }
        return indexOfMax;
    }

    private Long maxValue(long[] nodes) {
    
    long max=Long.MIN_VALUE;
        for (int i = 0; i < nodes.length; i++) {
            if(nodes[i]>max){
                max=nodes[i];
            }
        }
        return max;
    }
}
