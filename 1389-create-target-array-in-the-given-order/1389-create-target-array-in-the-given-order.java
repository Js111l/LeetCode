class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        LinkedList<Integer> list=new LinkedList<>();
        for(int i=0;i<index.length;i++){
            list.add(index[i],nums[i]);
        }
        int [] list1 =new int[index.length];
        for(int i=0;i<list.size();i++){
            list1[i]=list.get(i);
        }
        return list1;
        }
    }

