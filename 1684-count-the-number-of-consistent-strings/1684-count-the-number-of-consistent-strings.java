class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int counter = 0;
        for (String word : words
        ) {
            if (helper(word, allowed)) {
                counter++;
            }
        }
        return counter;
    }

    private boolean helper(String word, String allowed) {
        Set<Character> wordList=
        word.chars().mapToObj(x->(char)x).sorted().collect(Collectors.toSet());
        Set<Character> allowedList=
        allowed.chars().mapToObj(x->(char)x).sorted().collect(Collectors.toSet());
        for (Character c:wordList
             ) {
            if(!allowedList.contains(c)){
                return false;
            }
        }
        return true;
    }
}