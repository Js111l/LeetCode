class Solution {
    public String customSortString(String order, String s) {

        String[] strings = s.split("");
        Arrays.sort(strings, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return order.indexOf(o1) - order.indexOf(o2);
            }
        });

        return String.join("", strings);
    }
}