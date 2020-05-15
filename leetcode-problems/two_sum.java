/*
Given an array of integers, return indices of the two numbers such that they add up to a specific target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

Example:

Given nums = [2, 7, 11, 15], target = 9,

Because nums[0] + nums[1] = 2 + 7 = 9,
return [0, 1].
*/

public class Solution{
    public int[] twoSum(int[] nums, int target){
        //initialize an integer array result_array of size 2
        int[] result_array = new int[2];
        //loop through array and let i be element 1
        for(int i = 0; i < nums.length; i++){
            //if element2 is equal to target-element1, store indices of element1 and element2 in the result_array
            for(int j = i+1; j < nums.length; j++){
                if(nums[i] < target){
                    if(target - nums[i] == nums[j]){
                        result_array[0] = i;
                        result_array[1] = j;
                        //break out of loop - there is exactly one solution!
                        break;
                    }
                }
            }
        }
        //return result_array
        return result_array;
    }
}