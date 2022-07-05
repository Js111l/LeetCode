

class Solution {
    public boolean isAnagram(String s, String t) {

        List<Boolean> test=new ArrayList<>();
        if(s.length()==t.length()){
            char [] c=s.toCharArray();
            char [] c1=t.toCharArray();
            Arrays.sort(c);
            Arrays.sort(c1);
            for(int i=0;i<c.length;i++){
                if(c[i]==c1[i]){
                    continue;
                }
                else {
                    test.add(false);
                }
            }
            int co=0;
            for(int i=0;i<test.size();i++){
                if(!test.get(i)){
                    co++;
                }
                else continue;
            }
            if(co<1){
                return true;
            }
            
        }
        return false;
    }
}