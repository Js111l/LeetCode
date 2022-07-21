import java.math.BigInteger;
class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {

        StringBuilder s= new StringBuilder();
        Arrays.stream(num).forEach(x->s.append(x));
        BigInteger a1=new BigInteger(s.toString());
        String res=String.valueOf(a1.add(new BigInteger(String.valueOf(k))));
        List<Integer> resultList=new ArrayList<>();

        for(int i=0;i<res.length();i++){
            resultList.add(res.charAt(i)-48);
        }
        return resultList;

    }
}


