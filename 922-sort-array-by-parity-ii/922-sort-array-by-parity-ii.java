class Solution {
    public int[] sortArrayByParityII(int[] nums) {

        List<Integer> odd=new ArrayList<>();
        List<Integer> even=new ArrayList<>();
        int [] newArray=new int[nums.length];

        for(int i=0;i< nums.length;i++){
           if(nums[i]%2==0){
               even.add(nums[i]);
               
           }
           if(nums[i]%2!=0){
               odd.add(nums[i]);
           }
        }
        int indexOdd=0;
        int indexEven=0;
        
        for(int i=0;i<nums.length;i++){
            if(i%2==0){
                newArray[i]=even.get(indexEven);
                indexEven++;
            }
            if(i%2!=0){
                newArray[i]=odd.get(indexOdd);
                indexOdd++;
            }
        }
        
        
        return newArray;


    }
}