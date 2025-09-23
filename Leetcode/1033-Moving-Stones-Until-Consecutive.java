import java.util.Arrays;

class Solution {
    public int[] numMovesStones(int a, int b, int c) {
        int[] stones = {a, b, c};
        Arrays.sort(stones);

        int gap1 = stones[1] - stones[0] - 1;
        int gap2 = stones[2] - stones[1] - 1;

        int maxMoves = gap1 + gap2;
        int minMoves;

        if (maxMoves == 0) {
            minMoves = 0;
        } else if (gap1 <= 1 || gap2 <= 1) {
            minMoves = 1;
        } else {
            minMoves = 2;
        }

        return new int[]{minMoves, maxMoves};
    }
}
