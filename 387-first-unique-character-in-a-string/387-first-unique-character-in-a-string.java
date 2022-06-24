
class Solution {
    public int firstUniqChar(String s) {

        Map<Character, Integer> mapa = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            mapa.put(s.charAt(i), mapa.getOrDefault(s.charAt(i), 0) + 1);
        }
        for (int i = 0; i < s.length(); i++) {
            if (mapa.get(s.charAt(i)) == 1) {
                return i;
            }
            
        }
        return -1;
    }
}

