class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        List<String> stringList = List.of(words);
        return Arrays.stream(words).
                sorted(Comparator.comparing(x -> Collections.frequency(stringList, x))).
                distinct().sorted(new Comparator<String>() {
                    @Override
                    public int compare(String o1, String o2) {
                        int freqO1 = Collections.frequency(List.of(words), o1);
                        int fregO2 = Collections.frequency(List.of(words), o2);

                        if (freqO1 != fregO2) {
                            return fregO2 - freqO1;
                        }
                        if (freqO1 == freqO1) {
                            return o1.compareTo(o2);
                        }
                        return -1;
                    }
                }).limit(k).collect(Collectors.toList());
    }
}
