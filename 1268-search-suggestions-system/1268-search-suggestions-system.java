class Solution {
    public List<List<String>> suggestedProducts(String[] products, String searchWord) {


        Arrays.sort(products);


        List<List<String>> list=new ArrayList<>();

        List<String> list1 = new ArrayList<>();

        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < searchWord.length(); i++) {
            stringBuilder.append(searchWord.charAt(i));
            list1=Arrays.stream(products).filter(x->x.startsWith(stringBuilder.toString()))
                    .limit(3).collect(Collectors.toList());
            list.add(list1);
        }
        return list;

    }
}
