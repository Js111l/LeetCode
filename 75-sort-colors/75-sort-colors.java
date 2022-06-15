class Solution{
    public void sortColors(int[] nums) {
        quickSort(nums,0,nums.length-1);
    }

        void quickSort(int [] arr, int low, int high){

            int i =low;
            int j=high;
            int pivot = arr[low+(high-low)/2];

            if(arr.length==0 || arr==null){
                return;
            }

            if(low>=high) {
                return;
            }
            while (i<=j){

                while (arr[i]<pivot){
                    i++;
                }
                while (pivot<arr[j]){
                    j--;
                }

                if(i<=j){
                    swap(arr,i,j);
                    i++;
                    j--;

                }

            }
            if(low<j){
                quickSort(arr,low,j);
            }
            if(i<high){
                quickSort(arr,i,high);
            }



        }

        private void swap(int[] arr, int i, int j) {
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }

}