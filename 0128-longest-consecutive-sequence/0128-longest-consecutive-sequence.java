class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet <Integer> set = new HashSet<>();
        for(int num : nums){
            set.add(num);
        }
        int maxlen = 0;
        for(Integer element : set){
            if(!set.contains(element - 1)){
                int len = 1;
                while(set.contains(element + 1)){
                    len++;
                    element++;
                }
                maxlen = Math.max(maxlen , len);
            }
        }
        return maxlen;
    }
}