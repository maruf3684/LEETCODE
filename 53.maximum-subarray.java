/*
 * @lc app=leetcode id=53 lang=java
 *
 * [53] Maximum Subarray
 */

// @lc code=start
class Solution {
    public int maxSubArray(int[] nums) {
        int max_count=Integer.MIN_VALUE;
        int counter=0;
        for (int index = 0; index < nums.length; index++) {
            counter=counter+nums[index];
            if (counter > max_count){
                max_count=counter;
            }
            if (counter<0){
                counter=0;
            }
        }
        return max_count;
    }
}
// @lc code=end

