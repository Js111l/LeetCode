class Solution {
   static public List<List<String>> suggestedProducts(String[] products, String searchWord) {

        Arrays.sort(products);
        List<List<String>> list=new ArrayList<>();
        for (int i = 0; i < searchWord.length(); i++) {
            List<String> listL = new ArrayList<>();
            String prefix=searchWord.substring(0,1+i);
            for (String product:products
                 ) {
                if(product.startsWith(prefix)){
                    listL.add(product);
                }
                if(listL.size()>=3){
                    break;
                }
            }
            list.add(listL);
        }
        return list;

    }
}
