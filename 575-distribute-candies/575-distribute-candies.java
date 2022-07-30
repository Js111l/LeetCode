class Solution {
    public int distributeCandies(int[] candyType){

        Set<Integer> set=new HashSet<>();
        Arrays.stream(candyType).forEach(x->set.add(x));
        System.out.println(set);
        int size=set.size();
        int numOfCandies=candyType.length/2;
        if(size<=numOfCandies){
            return size;
        }
        return numOfCandies;
    }

}
