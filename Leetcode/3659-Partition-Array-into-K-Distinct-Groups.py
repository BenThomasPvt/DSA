class Solution(object):
    def partitionArray(self, nums, k):
        """
        :type nums: List[int]
        :type k: int
        :rtype: bool
        """
        n= len(nums)
        if (n % k != 0):
            print(len(nums))
            return False

        freq = Counter(nums)
        groups = n // k
        for count in freq.values():
            if count > groups :
                return False
        
        return True