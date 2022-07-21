class Solution {
    public int maxScoreSightseeingPair(int[] values)

    {

        //8,1,5,2,6]
/// i<j
        //The score of a pair (i < j) of sightseeing spots is values[i] + values[j] + i - j:
        // the sum of the values of the sightseeing spots, minus the distance between them.
 ///return max value

        int maxScore=Integer.MIN_VALUE;

         int i =values[0]+0;
        
         for (int j =1;j< values.length;j++)
        {
            maxScore = Math.max(maxScore, (i+ values[j] - j));
            i=Math.max(i,values[j]+j);
        }
        return maxScore;

        }
        }

