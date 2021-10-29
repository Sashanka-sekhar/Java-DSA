
/*
Input: nums = [5,7,7,8,8,10], target = 8
Output: [3,4]

Input: nums = [5,7,7,8,8,10], target = 6
Output: [-1,-1]

Input: nums = [], target = 0
Output: [-1,-1]
*/

class Solution {
    public int[] searchRange(int[] nums, int target) {
        
        Arrays.sort(nums);
        
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == target){
                for(int j = nums.length -1; j >= 0; j--){
                    if(nums[j] == target){
                        return new int[] {i,j};
                    }
                }
            }
        }
        
        return new int[] {-1, -1};
        
        
    }
}