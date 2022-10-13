class Solution {
    public int percentageLetter(String s, char letter) {
        List<Character> list=new ArrayList<>();
        for (Character c:s.toCharArray()
             ) {
            list.add(c);
        }
        Double numb = Double.valueOf(Collections.frequency(list, letter));
        return (int) (numb/s.length()*100);
    }
}