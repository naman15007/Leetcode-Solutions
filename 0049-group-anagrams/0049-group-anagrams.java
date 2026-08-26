class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
       HashMap <String , List> map = new HashMap <>();
       for(int i = 0 ; i < strs.length ; i++){
        int [] count = new int [26];
        for(char c : strs[i].toCharArray()){
            count[c - 'a']++;
        }
        StringBuilder sb = new StringBuilder();
        for(int d : count){
            sb.append(d);
            sb.append("#");
        }
        String key = sb.toString();
        if(!map.containsKey(key)){
            map.put(key , new ArrayList<String>());
        }
        map.get(key).add(strs[i]);
       }
       return new ArrayList(map.values());
    }
}