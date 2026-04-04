class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        int max = 0;
        
        int l = 0;

        Set<Character> set = new HashSet<>();

        for(int r = 0; r < s.length(); r++){

            char curr = s.charAt(r);

            while(set.contains(curr)){

                set.remove(s.charAt(l));
                l++;
            }
            set.add(curr);
            max = Math.max(max, r - l + 1);
        }

        return max;
    }
}
