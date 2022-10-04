class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int counter = 0;
        for (String word : words
        ) {
            if(helper(word,allowed)){
                counter++;
            }
        }
        return counter;
    }
    private boolean helper(String word, String allowed) {
        for (int i = 0; i <word.length() ; i++) {
            if(!allowed.contains(String.valueOf(word.charAt(i)))){
                return false;
            }
        }
    return true;
    }
}


