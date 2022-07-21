class Solution {
    public int maxScoreSightseeingPair(int[] values) {
        int firstValue = values[0] + 0;
        int result=firstValue+values[1]-1;
        for (int i = 1; i < values.length ; i++) {
        
            result=Math.max(result,firstValue+values[i]-i);
            firstValue=Math.max(firstValue,values[i]+i);
        }
        return result;

    }
}

