class Solution(object):
    def uncommonFromSentences(self, s1, s2):
        words=(s1+" "+s2).split()
        ans=[]
        for word in words:
            if words.count(word)==1:
                ans.append(word)
        return ans