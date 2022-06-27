import java.math.BigInteger;
class Solution {
    StringBuilder stringBuilder2;

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        List<String> list = new ArrayList<>();

        StringBuilder stringBuilder = new StringBuilder();
        while (!String.valueOf(l1.val).isEmpty()) {
            BigInteger a = BigInteger.valueOf(l1.val);
            System.out.println(l1.val);
            stringBuilder.append(a);
            if ((l1.next == null)) {
                break;
            } else
                l1 = l1.next;

        }
        StringBuilder stringBuilder1 = new StringBuilder();
        while (!String.valueOf(l2.val).isEmpty()) {
            BigInteger a = BigInteger.valueOf(l2.val);
            System.out.println(l2.val);
            stringBuilder1.append(a);
            if ((l2.next == null)) {
                break;
            } else
                l2 = l2.next;

        }
        BigInteger integer=new BigInteger(stringBuilder1.reverse().toString());
        BigInteger integer1=new BigInteger(stringBuilder.reverse().toString());

        BigInteger sum =integer.add(integer1);

        String sumToString = String.valueOf(sum);

        stringBuilder2 = new StringBuilder();

        for (int i = sumToString.length() - 1; i >= 0; i--) {
            stringBuilder2.append(sumToString.charAt(i));
        }

        for (int i = 0; i < stringBuilder2.length(); i++) {
            System.out.println(stringBuilder2.toString().charAt(i));
        }
        int i = 0;

        ListNode resultNode = new ListNode(0);
        ListNode MMM =resultNode;


       while(i<stringBuilder2.length()){
            MMM.next=new ListNode(Integer.valueOf(stringBuilder2.toString().charAt(i))-48);
           MMM=MMM.next;

           System.out.println(stringBuilder2.toString().charAt(i));
           i++;
       }


        return resultNode.next;
    }


}
