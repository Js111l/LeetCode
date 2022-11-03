class Solution {
    public String replaceWords(List<String> dictionary, String sentence) {
        String[] words = sentence.split("\s+");
        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j <dictionary.size() ; j++) {
                if(words[i].startsWith(dictionary.get(j))){
                    words[i]=dictionary.get(j);
                }
            }
        }
        return Arrays.stream(words).collect(Collectors.joining( " "));
    }
}