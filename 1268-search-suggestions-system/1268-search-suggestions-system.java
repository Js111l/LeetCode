class Solution {
    public List<List<String>> suggestedProducts(String[] products, String searchWord) {
        Arrays.sort(products);
        
        List<List<String>> res = new ArrayList<>();
        for (int i = 0; i < searchWord.length(); i++) {
            String word = searchWord.substring(0,i+1);
            List<String> list = new ArrayList<>();
            for (String product : products) {
                if (product.length() < word.length())
                    continue;
                if (list.size() >= 3)
                    break;
                String sub = product.substring(0,i+1);
                if (word.equals(sub))
                    list.add(product);
            }

            res.add(list);
        }
        
        return res;
    }
}