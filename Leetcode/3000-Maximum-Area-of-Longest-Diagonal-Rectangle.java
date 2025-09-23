class Solution {
    public int areaOfMaxDiagonal(int[][] dimensions) {
        int ind = 0;
        double maxDiagonal = 0.0;
        int maxArea = 0;

        for (int i = 0; i < dimensions.length; i++) {
            int length = dimensions[i][0];
            int width = dimensions[i][1];
            double diagonal = Math.sqrt(length * length + width * width);
            int area = length * width;

            if (diagonal > maxDiagonal) {
                maxDiagonal = diagonal;
                maxArea = area;
                ind = i;
            } else if (Math.abs(diagonal - maxDiagonal) < 1e-9 && area > maxArea) {
                // If diagonals are effectively equal, prefer larger area
                maxArea = area;
                ind = i;
            }
        }

        return dimensions[ind][0] * dimensions[ind][1];
    }
}
