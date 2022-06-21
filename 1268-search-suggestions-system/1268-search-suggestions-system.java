class Solution {
   static public List<List<String>> suggestedProducts(String[] products, String searchWord) {
       
        Arrays.sort(products);

        List<List<String>> list=new ArrayList<>();
        List<String> list1 = new ArrayList<>();

        for (int i = 0; i < searchWord.length(); i++) {

            String prefix=searchWord.substring(0,1+i);
            list1=Arrays.stream(products).filter(x->x.startsWith(prefix))
                    .limit(3).collect(Collectors.toList());
            list.add(list1);
        }
        return list;

    }
}