class RotateArray {
    public void rotate(int[] nums, int k) {
        if(nums.length <=1){
            return;
        }
        if(k == nums.length){
            return;
        }
        if(k > nums.length){
            k = k - nums.length;
        }
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
            int t1 = t;
            while(t1 > 0){
                int temp2 = nums[t1-1];
                nums[t1] = temp2;
                t1--;
            }
            nums[0] = temp;
        }
    }
}