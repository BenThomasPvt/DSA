public class Solution {
    public int singleNumber(int[] nums) {
        int result = 0;
        for (int num : nums) {
            result ^= num;  // XOR to find the unique number
        }
        return result;
    }
}
