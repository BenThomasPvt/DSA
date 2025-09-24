class Solution {
    public int findMin(int[] nums) {
        int left = 0, right = nums.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            // If mid element is greater than right, min is on the right half
            if (nums[mid] > nums[right]) {
                left = mid + 1;
            }
            // Otherwise, min is on the left half (including mid)
            else {
                right = mid;
            }
        }

        return nums[left]; // left == right is the index of the smallest
    }
}
