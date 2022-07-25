
class Solution {
    public List<Integer> getRow(int k) {
        List<Integer> list = new ArrayList<Integer>();
        if (k <= 0) {
            list.add(1);
            return list;
        }
        list.add(1);
        list.add(1);
        return recurse(k, list, 2);
    }

    private List<Integer> recurse(int k, List<Integer> list, int n) {
        if (n <= k) {
           List<Integer> tempList=new ArrayList<>();
           tempList.add(1);
           for (int i=1;i<list.size();i++){
               tempList.add(list.get(i)+list.get(i-1));
           }
           tempList.add(1);
           return recurse(k,tempList,n+1);
        }

        return list;
    }

}