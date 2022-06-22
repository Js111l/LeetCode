class Solution {
    public double trimMean(int[] arr) {

        int percent= (int) (arr.length*0.05);
        double sum =0;
        Arrays.sort(arr);
        for(int i=0+percent;i<arr.length-percent;i++){
        sum+=(double) arr[i];
        }
        return (sum/(arr.length-(2*percent)));
    }
}
