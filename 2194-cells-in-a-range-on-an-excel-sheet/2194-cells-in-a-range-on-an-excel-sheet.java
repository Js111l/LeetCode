
class Solution {
    public List<String> cellsInRange(String s) {
        char first = s.charAt(0);
        char second =s.charAt(3);
        int range = s.charAt(1);
        int range1 = s.charAt(4);

        List<String> list=new ArrayList<>();
        for(char i=first;i<=second;i++){
            for(int j=range;j<=range1;j++){
                list.add(String.valueOf(i)+String.valueOf(j-48));
            }
        }
return list;
        
    }
}