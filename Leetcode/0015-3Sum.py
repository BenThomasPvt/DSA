class Solution(object):
    def threeSum(self, nums):
        nums.sort()
        n = len(nums)
        arr = []
        
        for i in range(n):
            if i > 0 and nums[i] == nums[i - 1]:
                continue
            
            p1, p2 = i + 1, n - 1
            while p1 < p2:
                total = nums[i] + nums[p1] + nums[p2]
                if total == 0:
                    arr.append([nums[i], nums[p1], nums[p2]])
                    while p1 < p2 and nums[p1] == nums[p1 + 1]:
                        p1 += 1
                    while p1 < p2 and nums[p2] == nums[p2 - 1]:
                        p2 -= 1
                    p1 += 1
                    p2 -= 1
                elif total < 0:
                    p1 += 1
                else:
                    p2 -= 1
        
        return arr

        """
        :type nums: List[int]
        :rtype: List[List[int]]
        """
        