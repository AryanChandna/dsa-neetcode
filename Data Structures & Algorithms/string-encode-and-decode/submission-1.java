class Solution {

    public String encode(List<String> strs) {

        StringBuilder sb = new StringBuilder();

        for(String str : strs){

            sb.append(str.length()).append("#").append(str);
        }

        return sb.toString();
    }

    public List<String> decode(String str) {

        int i = 0;
        List<String> ans = new ArrayList<>();

        while(i < str.length()){

            int j = i;

            while(str.charAt(j) != '#'){
                j++;
            }

            int len = Integer.parseInt(str.substring(i,j));

            String res = str.substring(j + 1, j + 1 + len);
            ans.add(res);
            i = j + 1 + len;


        }

        return ans;
    }
}
