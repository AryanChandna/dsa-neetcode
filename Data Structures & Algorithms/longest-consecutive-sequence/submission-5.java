class Solution {
    public int longestConsecutive(int[] nums) {
     

     HashSet<Integer> set = new HashSet<>();

     for(int val : nums){
        set.add(val);
     }
    
    int max = 0;

    for(int val : set){

        if(!set.contains(val - 1)){

            int curr = val;
            int len = 1;

            while(set.contains(val + 1)){
                val++;
                len++;
            }

            max = Math.max(max, len);
        }
    }
            return max;

    }
}
