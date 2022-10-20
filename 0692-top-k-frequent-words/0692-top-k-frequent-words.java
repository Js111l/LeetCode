class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        int size = Arrays.stream(words).distinct().collect(Collectors.toList()).size();
        List<String> list= Arrays.stream(words).
                sorted(Comparator.comparing(x -> Collections.frequency(List.of(words), x))).
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
                }).collect(Collectors.toList());
        return list.subList(0,k);
    }
}
