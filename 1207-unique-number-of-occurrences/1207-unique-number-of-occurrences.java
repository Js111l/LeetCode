class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        List<Integer> list = new ArrayList<>();
        Set<Integer> unique = Arrays.stream(arr).mapToObj(x -> Integer.valueOf(x)).collect(Collectors.toSet());
        for (Integer num : unique
        ) {
            list.add(
                    Collections.frequency(Arrays.stream(arr).mapToObj(x -> Integer.valueOf(x)).collect(Collectors.toList()), num)
            );
        }

        Collections.sort(list);
        Set<Integer> set = new TreeSet<>();
        list.forEach(x -> set.add(x));
        set.forEach(System.out::println);
        for (Integer num : list
        ) {
            if (!set.contains(num)) {
                return false;
            }
            set.remove(num);
        }

        return true;
    }
}
