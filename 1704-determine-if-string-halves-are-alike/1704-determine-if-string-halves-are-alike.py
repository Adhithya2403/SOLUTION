class Solution(object):
    def halvesAreAlike(self, s):
        ss = set('aeiouAEIOU')
        a = 0
        b = 0
        for i in range(len(s)//2):
            if s[i] in ss:
                a += 1       
        for i in range(len(s)//2, len(s)):
            if s[i] in ss:
                b += 1      
        return a == b