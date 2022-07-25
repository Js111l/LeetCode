
class Solution {
    public List<Integer> getRow(int k)
    {
        List<Integer> ans = new ArrayList<>();

        if(k <= 0)
        {
            ans.add(1);
            return ans;
        }
        ans.add(1);
        ans.add(1);

        return recurse(k,ans,2);
    }

    List<Integer> recurse(int k, List<Integer> list, int n)
    {
        if(n<=k)
        {
            List<Integer> tmp = new ArrayList<>();
            tmp.add(1);     
            //1


            for(int i=1; i<list.size(); i++)
            {
                System.out.println(list.get(i));

                tmp.add(list.get(i)+list.get(i-1));

            }
            tmp.add(1);

            return recurse(k,tmp,n+1);

        }
        return list;
    }

}