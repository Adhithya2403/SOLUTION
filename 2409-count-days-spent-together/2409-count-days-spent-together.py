class Solution(object):
    def countDaysTogether(self, arriveAlice, leaveAlice, arriveBob, leaveBob):
        months = [31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31]
        def day(date):
            m,d = map(int,date.split("-"))
            return sum(months[:m-1])+d
        at=day(arriveAlice)
        ad=day(leaveAlice)
        bt=day(arriveBob)
        bd=day(leaveBob)
        end=min(ad,bd)
        start=max(at,bt)
        return max(0,end-start+1) 

        