class Solution {
    public boolean isPowerOfThree(int n) {
        
        Double d = Math.log10(n) / Math.log10(3);

        return d %1 ==0;

    }
}