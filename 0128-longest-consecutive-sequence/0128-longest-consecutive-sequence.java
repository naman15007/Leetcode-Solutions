class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet <Integer> set = new HashSet<>();
        for(int num : nums){
            set.add(num);
        }
        int maxlen = 0;
        for(Integer x : set){
            if(!set.contains(x-1)){
                int len = 1;
                while(set.contains(x+1)){
                    len++;
                    x++;
                }
                maxlen = Math.max(maxlen , len);
            }
        }
        return maxlen;
    }
}