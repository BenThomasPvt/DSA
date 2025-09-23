class Solution(object):
    def permute(self, nums):
        from itertools import permutations
        l=list(permutations(nums))
        return l
        """
        :type nums: List[int]
        :rtype: List[List[int]]
        """
        