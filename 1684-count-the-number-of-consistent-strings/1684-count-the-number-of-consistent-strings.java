class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int counter = 0;
        Set<Character> allowedSet = allowed.chars().mapToObj(x -> (char) x).collect(Collectors.toSet());
        for (String word : words
        ) {
            Set<Character> set = word.chars().mapToObj(x -> (char) x).collect(Collectors.toSet());
            if (set.stream().filter(x->allowedSet.contains(x)).collect(Collectors.toSet()).size()==set.size()) {
                counter++;
            }
        }
        return counter;
    }

}
