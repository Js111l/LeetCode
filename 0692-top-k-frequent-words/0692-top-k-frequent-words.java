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
        List<String> priorityQueue=new ArrayList<>();
        for (String w : words
        ) {
            priorityQueue.add(w);
        }
        Collections.sort(priorityQueue,comparator);
        List<String> stringList =priorityQueue.stream().distinct().collect(Collectors.toList());
        return stringList.stream().limit(k).collect(Collectors.toList());
    }
}