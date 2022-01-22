/*
 * @lc app=leetcode id=14 lang=java
 *
 * [14] Longest Common Prefix
 */

// @lc code=start
class Solution {
    public String longestCommonPrefix(String[] strs) {
         String actual=strs[0];
         String temp="";
        for (int index = 1; index < strs.length; index++) {
           for (int i = 0; i < actual.length(); i++) {
                 if (strs[index].length()==i){
                    break;
                }
                if (actual.charAt(i)== strs[index].charAt(i)){
                  temp=temp+actual.charAt(i);
                }else{
                    break;
                }
           }
           actual=temp;
           temp="";
        }
        return actual;
    }
}
// @lc code=end

