class Solution {
    public String customSortString(String order, String s) {
        StringBuilder sb = new StringBuilder();
        Set<Character> st = new HashSet <>();
        int count[] = new int[26];
        for(char c : order.toCharArray()){
            st.add(c);
        }

        for(char c : s.toCharArray()){
            if(!st.contains(c)){
                sb.append(c);
            }
            else{
                count[c - 'a']++;
            }
        }

        for(char c : order.toCharArray()){
            int i = count[c - 'a'];
            while(i>0){
                sb.append(c);
                i--;
            }
        }
        return sb.toString();

        }
}