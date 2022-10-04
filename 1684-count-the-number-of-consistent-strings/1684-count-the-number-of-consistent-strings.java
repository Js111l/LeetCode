class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int counter = 0;
        for (String word : words
        ) {
            int c=0;
            for (int i = 0; i <word.length() ; i++) {
                if(allowed.contains(String.valueOf(word.charAt(i)))){
                    c++;
                }
            }
            if(c==word.length()){
                counter++;
            }
        }
        return counter;
    }

}


