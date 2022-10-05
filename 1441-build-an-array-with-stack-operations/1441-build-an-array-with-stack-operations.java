class Solution {
    public List<String> buildArray(int[] target, int n) {
        List<Integer> list = Arrays.stream(target).mapToObj(x -> Integer.valueOf(x)).collect(Collectors.toList());
        List<String> list1 = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if(list.equals(temp)){
                break;
            }
            if (list.contains(Integer.valueOf(i))) {
                list1.add("Push");
                temp.add(i);
            }else{
                list1.add("Push");
                list1.add("Pop");}
        }
        return list1;
    }
}
