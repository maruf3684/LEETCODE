#
# @lc app=leetcode id=58 lang=python3
#
# [58] Length of Last Word
#

# @lc code=start
class Solution:
    def lengthOfLastWord(self, s: str) -> int:
        count=0
        for char in s[::-1].strip():
            if char!=' ':
                count+=1
            else:
                return count
        return count



        
