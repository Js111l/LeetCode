import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        paragraph=paragraph.replaceAll("[^a-zA-Z0-9]"," ");
        paragraph=paragraph.replaceAll("\\s+",".");
        String [] array =paragraph.split("[.]");
        array= Arrays.stream(array).map(x->x.trim().toLowerCase(Locale.ROOT)).collect(Collectors.toList()).toArray(String[]::new);
        Map<String,Integer> map=new HashMap<>();
        Set<String> set= Arrays.stream(array).collect(Collectors.toSet());
        for (String s :set) {
            map.put(s,0);
        }
        Set<String> bannedWords= Arrays.stream(banned).map(x->x.trim().toLowerCase(Locale.ROOT)).collect(Collectors.toSet());
        for (int i = 0; i < array.length; i++) {
            if(!bannedWords.contains(array[i])&&map.keySet().contains(array[i])){
                map.put(array[i],map.get(array[i])+1);
            }
        }
       Optional<Map.Entry<String,Integer>> optional=map.entrySet().stream().
               max((Map.Entry<String,Integer>e1,Map.Entry<String,Integer>e2)->e1.getValue().compareTo(e2.getValue()));
        return optional.get().getKey();
    }
}