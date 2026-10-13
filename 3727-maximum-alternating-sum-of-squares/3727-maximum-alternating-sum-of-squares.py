class Solution(object):
    def maxAlternatingSum(self, nums):
        nums.sort(key=lambda x:x*x)
        n=len(nums)
        ans=0
        for i in range(n):
            if i<(n+1)//2:
                ans+=nums[n-1-i]**2
            else:
                ans-=nums[n-1-i]**2
        return ans
        