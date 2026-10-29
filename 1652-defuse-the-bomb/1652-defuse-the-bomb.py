class Solution:
    def decrypt(self, code, k):
        n = len(code)
        ans = []

        for i in range(n):
            total = 0

            if k > 0:
                for j in range(1, k + 1):
                    total += code[(i + j) % n]

            elif k < 0:
                for j in range(1, -k + 1):
                    total += code[(i - j) % n]

            ans.append(total)

        return ans