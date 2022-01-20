/*
 * @lc app=leetcode id=26 lang=java
 *
 * [26] Remove Duplicates from Sorted Array
 */

// @lc code=start
class Solution {
    public int removeDuplicates(int[] nums) {
      if (nums.length==0){
          return 0;
      }
      if (nums.length==1){
        return 1;
      }
      
      int i=1;
      int j=0;

      while(i<nums.length){
          if (nums[i]!=nums[i-1]){
             nums[j]=nums[i-1];
             j++;
          }
          
          if (i==nums.length-1){
              nums[j]=nums[nums.length-1];
              j++;
          }
          i++;
      }

      
    return  j;
 

    }
    
}
// @lc code=end

