class Solution {
    public void reverseString(char[] s) {

        helper(0,s);
        

    }

    private void helper(int i, char[] s) {
    if(i>=s.length/2||s==null){
        return;
    }
    System.out.println(s[i]);
    char temp=s[i];
    s[i]=s[s.length-1-i];
    s[s.length-1-i]=temp;
    helper(i+1,s);


    }
}
