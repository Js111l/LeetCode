class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        Comparator<String> comparator = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                int freqO1 = Collections.frequency(List.of(words), o1);
                int fregO2 = Collections.frequency(List.of(words), o2);

                if (freqO1 != fregO2) {
                    return fregO2 - freqO1;
                }
                if (freqO1 == fregO2) {
                    return o1.compareTo(o2);
                }
                return -1;
            }
        };

        Set<String> set=new TreeSet<>(comparator);
        for (String w : words
        ) {
            set.add(w);
        }
        return set.stream().limit(k).toList();
    }
}
