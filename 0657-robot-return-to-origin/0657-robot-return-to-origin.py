class Solution(object):
    def judgeCircle(self, moves):
        a=moves.count("U")
        b=moves.count("D")
        c=moves.count("L")
        d=moves.count("R")

        if a==b:
            if c==d:
                return True
        return False