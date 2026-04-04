class Solution {
    public int maxArea(int[] heights) {
        
        int n = heights.length;
        int max = Integer.MIN_VALUE;

        for(int i = 0; i < n - 1; i++){
            int currMax = 0;
            for(int j = i + 1; j < n; j++){

                int units = Math.min(heights[i], heights[j]);

                currMax = Math.max(currMax,(units * (j - i)));

            }

            max = Math.max(currMax, max);
    
        }
        return max;
    }
    
}
