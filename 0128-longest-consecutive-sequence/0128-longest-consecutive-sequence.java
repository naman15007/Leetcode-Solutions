class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int num : nums){
            set.add(num);
        }
        int maxlen = 0 ;
        for(Integer element : set){
            if(!set.contains(element - 1)){
                int len = 1;
                while(set.contains(element + 1)){
                    element++;
                    len++;
                }
                maxlen = Math.max(maxlen , len);
            }
        }
        return maxlen;
    }
}