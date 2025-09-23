class Solution(object):
    def gcdOfOddEvenSums(self, n):
        """
        :type n: int
        :rtype: int
        """
        sumOdd = n*n
        sumEven = n * (n-1)
        return self.gcd(sumOdd, sumEven)
        
    def gcd(self, a, b):
        if b == 0:
            return a
        else:
            return self.gcd(b, a % b) 