class RotateArray {
    public void rotate(int[] nums, int k) {
        //firt loop - iterate k times
        for(int i = 0; i <= 2; i++){
            //inner loop - iterate nums.length - 1 - i times. i starts from 1
            int x = nums[i];
            for(int j = i+1; j < nums.length-1-i; j++){
                int temp = nums[j];
                nums[j] = x;
                x = temp;
            }
        }
    }
}