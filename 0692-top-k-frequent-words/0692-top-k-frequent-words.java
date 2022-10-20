class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        HashMap<String,Integer> hashMap=new HashMap<>();
        for (String word:words) {
            hashMap.put(word,hashMap.getOrDefault(word,0)+1);
        }
        Comparator<String> comparator = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                int freqO1 = hashMap.get(o1);
                int fregO2 = hashMap.get(o2);

                if (freqO1 != fregO2) {
                    return fregO2 - freqO1;
                }
                if (freqO1 == fregO2) {
                    return o1.compareTo(o2);
                }
                return -1;
            }
        };
        return Arrays.stream(words).sorted(comparator).distinct().limit(k).collect(Collectors.toList());
    }
}
