class SearchInsert {
    public int searchInsert(int[] nums, int target) {
        //if target less than or equal to first element, return 0
        if(target <= nums[0]){
            return 0;
        }
        //if target >= last element, return nums.length
        if(target > nums[nums.length-1]){
            return nums.length;
        }
        int result_idx = 0;
        for(int i = 0; i < nums.length;i++){
            //if target is in the array
            if(target == nums[i]){
                result_idx = i;
            }
            //if target is not in the array
            else if(target > nums[i] && target < nums[i+1]){
                result_idx = i+1;
            }
        }
        return result_idx;
    }
}