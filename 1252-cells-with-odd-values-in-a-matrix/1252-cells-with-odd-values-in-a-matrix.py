class Solution(object):
    def oddCells(self, m, n, indices):
        matrix = [[0]*n for _ in range(m)]
        for r,c in indices:
            for j in range(n):
                matrix[r][j] +=1
            for i in range(m):
                matrix[i][c]+=1
        ans=0
        for i in range(m):
            for j in range(n):
                if matrix[i][j]%2==1:
                    ans+=1
        return ans