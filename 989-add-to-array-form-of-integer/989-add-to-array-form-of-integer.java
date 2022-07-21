import java.math.BigInteger;
class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {


        StringBuilder stringBuilder=new StringBuilder();

        for (int n:num
             ) {
            stringBuilder.append(n);
        }

        BigInteger a = new BigInteger(stringBuilder.toString());
        BigInteger ks=new BigInteger(String.valueOf(k));
        String res=String.valueOf(a.add(ks));
        List<Integer> resultArray=new ArrayList<>();
        for(int i=0;i<res.length();i++){
            resultArray.add(res.charAt(i)-48);
        }
        return resultArray;

    }
}