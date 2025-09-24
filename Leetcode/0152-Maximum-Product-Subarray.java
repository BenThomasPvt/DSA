class Solution {
    public int maxProduct(int[] nums) {
        if (nums.length == 0) return 0;

        int maxSoFar = nums[0];
        int maxEndingHere = nums[0];
        int minEndingHere = nums[0];

        for (int i = 1; i < nums.length; i++) {
            int current = nums[i];

            // If current is negative, swap max and min
            if (current < 0) {
                int temp = maxEndingHere;
                maxEndingHere = minEndingHere;
                minEndingHere = temp;
            }

            maxEndingHere = Math.max(current, maxEndingHere * current);
            minEndingHere = Math.min(current, minEndingHere * current);

            maxSoFar = Math.max(maxSoFar, maxEndingHere);
        }

        return maxSoFar;
    }
}
