class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        HashMap<String,Integer> hashMap=new HashMap<>();
        for (String word:words) {
            if(hashMap.containsKey(word)){
                hashMap.put(word,hashMap.get(word)+1);
            }else
                hashMap.put(word,1);
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

        Set<String> priorityQueue=new TreeSet<>(comparator);
        for (String w : words
        ) {
            priorityQueue.add(w);
        }
        return priorityQueue.stream().limit(k).toList();
    }
}