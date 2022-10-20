class Solution {
    public int lengthOfLastWord(String s) {
        return Arrays.stream(s.split("\s+")).reduce((x, y) -> y).get().length();
    }
}