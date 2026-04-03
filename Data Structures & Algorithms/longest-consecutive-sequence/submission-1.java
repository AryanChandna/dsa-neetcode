class Solution {
    public int longestConsecutive(int[] nums) {
        
        Arrays.sort(nums);
        int n = nums.length;
        int curr = 1;
        int max = 1;

        if(nums.length == 0){
            return 0;
        }

        for(int i = 1; i < n; i++){

            if(nums[i] == nums[i - 1])
                continue;
            
            else if(nums[i] == nums[i - 1] + 1){
                curr++;
            }

            else{
                max = Math.max(curr, max);
                curr = 1;
            }
        }
        return Math.max(max, curr);
    }
}
