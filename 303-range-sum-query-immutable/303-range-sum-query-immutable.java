class NumArray {
int [] array;
    public NumArray(int[] nums) {
    this.array=nums;
    }

    public int sumRange(int left, int right) {
       return IntStream.rangeClosed(left,right).map(x->array[x]).sum();
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */