class Solution {
    public int maxArea(int[] heights) {
        
        int max = Integer.MIN_VALUE;

        int n = heights.length;

        int left = 0;
        int right = n - 1;

        while(left < right){

            int currUnits = Math.min(heights[left], heights[right]);

            int currArea = currUnits * (right - left);

            if(heights[left] < heights[right])
                left++;
            else
                right--;

            max = Math.max(max, currArea);
        }

        return max;
    }
}
