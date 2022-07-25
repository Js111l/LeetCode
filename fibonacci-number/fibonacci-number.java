class Solution
{

    HashMap<Integer,Integer> hashMap=new HashMap<>();

    public int fib(int n)
    {
        if(n<2){
            return n;
        }
        
        
        if(hashMap.containsKey(n)){
            return hashMap.get(n);
        }
        int result;
        result=fib(n-1)+fib(n-2);
        hashMap.put(n,result);
        return result;
    }
}

