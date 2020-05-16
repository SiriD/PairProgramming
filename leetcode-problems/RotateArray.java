class RotateArray {
    public void rotate(int[] nums, int k) {
        //outer loop - iterate k times
        for(int t = 0; t <= k-1; t++){
            //inner loop - iterate nums.length times. j starts from 1
            int x = nums[t];
            int temp = 0;
            for(int j = t+1; j < nums.length; j++){
                temp = nums[j];
                nums[j] = x;
                x = temp;
            }
            nums[t] = temp;
        }
    }
}