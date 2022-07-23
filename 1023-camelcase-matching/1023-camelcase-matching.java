
class Solution {
    public List<Boolean> camelMatch(String[] queries, String pattern) {
List<Boolean> match=new ArrayList<>();
        for (String q :queries
        ) {
            match.add(check(q,pattern));
        }

return match;

    }

    private Boolean check(String q, String pattern) {

        int i=0;
        for (char c:q.toCharArray()
             ) {
            if(i<pattern.length()&&c==pattern.charAt(i)){
                i++;
            }
            else if(c<'a'){
                return false;
            }
            
        }
        return i==pattern.length();
    }
}
