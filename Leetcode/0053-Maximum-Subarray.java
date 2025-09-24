class Solution {
    public int maxSubArray(int[] nums) {
        int cur = 0, best = Integer.MIN_VALUE;
        for(int x : nums){
            cur = Math.max(x, cur + x);
            best = Math.max(best, cur);
        }
        return best;
    }
}
