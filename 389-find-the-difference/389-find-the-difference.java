class Solution {
    public char findTheDifference(String s, String t) {

        String originalString = s;
        String modifedString = t;
        int sum=0;
        int sum1=0;
        for (int i=0;i<originalString.length();i++)
        {
            sum+=originalString.charAt(i);
        }
        for(int i=0;i<modifedString.length();i++){
            sum1+=modifedString.charAt(i);
        }
        
        return (char) (sum1-sum);
    }
}

