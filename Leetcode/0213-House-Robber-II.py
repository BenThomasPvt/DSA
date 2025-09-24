class Solution(object):
    def rob(self, nums):
        def rob_linear(houses):
            prev = 0
            curr = 0
            for money in houses:
                temp = curr
                curr = max(curr, prev + money)
                prev = temp
            return curr

        n = len(nums)
        if n == 0:
            return 0
        if n == 1:
            return nums[0]

        # Case 1: Exclude last house
        case1 = rob_linear(nums[:-1])
        # Case 2: Exclude first house
        case2 = rob_linear(nums[1:])
        return max(case1, case2)
