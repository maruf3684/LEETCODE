/*
 * @lc app=leetcode id=35 lang=java
 *
 * [35] Search Insert Position
 */

// @lc code=start
class Solution {
    public int searchInsert(int[] nums, int target) {
        for (int index = 0; index < nums.length; index++) {
            if(nums.length==0){
              return 0;
            }
            else if (target==nums[index]){
                return index;
                
            }
            else if (nums[index]>target){
                return index;
            }
        }
        return nums.length;
    }
}
// @lc code=end

