
class Solution {
    public char findTheDifference(String s, String t) {

        String originalString = s;
        String modifedString = t;

        List<Character> setOrig = new ArrayList<>();
        List<Character> setModif = new ArrayList<>();


        for (int i = 0; i < originalString.length(); i++) {
            setOrig.add(originalString.charAt(i));
        }
        for (int i = 0; i < modifedString.length(); i++) {
            setModif.add(modifedString.charAt(i));
        }

        setOrig.add(',');

        Collections.sort(setOrig);
        Collections.sort(setModif);

        char result=' ';
        for (int i = 0; i < setModif.size(); i++) {
            if (!String.valueOf(setModif.get(i)).equals(String.valueOf(setOrig.get(i)))) {
                result=setModif.get(i);
            }

            System.out.println(setModif.size());
            System.out.println(setOrig.size());
        }
    return result;
    }
}