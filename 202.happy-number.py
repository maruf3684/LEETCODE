#
# @lc app=leetcode id=202 lang=python3
#
# [202] Happy Number
#

# @lc code=start
class Solution:
    def isHappy(self, n: int) -> bool:
        self.first =n
        self.slow=n
        while True:
            self.first =Solution.findSqure(Solution.findSqure(self.first))
            self.slow=Solution.findSqure(self.slow)
            if self.first==1:
                return True
            if self.first==self.slow:
                return False

    @staticmethod
    def findSqure(n):
        ans=0
        while (n>0):
            reminder=n%10
            ans=ans+reminder*reminder
            n=n//10
        return ans


