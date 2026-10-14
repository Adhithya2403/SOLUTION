class Solution(object):
    def sortArrayByParity(self, nums):
        arr=[]
        for i in nums:
            if i%2 == 0:
                arr.append(i)
        for i in nums:
            if i%2!=0:
                arr.append(i)
        return arr
        