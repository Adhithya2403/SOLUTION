class Solution(object):
    def findTheDifference(self, s, t):
        d = {}

        for i in t:
            d[i] = d.get(i, 0) + 1

        for i in s:
            d[i] -= 1

        for i in d:
            if d[i] == 1:
                return i