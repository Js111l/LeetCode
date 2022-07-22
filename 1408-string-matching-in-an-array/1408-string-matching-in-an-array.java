class Solution {
    public List<String> stringMatching(String[] words) {
        List<String> strings = new ArrayList<>();
        for (String s1 : words
        ) {
            for (String s2 : words
            ) {
                if (!s1.equals(s2)) {
                    if (s1.indexOf(s2) != -1 && !strings.contains(s2)) {
                    strings.add(s2);
                    }
                    if (s2.indexOf(s1) != -1 && !strings.contains(s1)) {
                                               strings.add(s1);

                    }
                }

            }
        }
        return strings;
    }


}