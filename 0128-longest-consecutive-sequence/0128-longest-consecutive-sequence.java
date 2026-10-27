class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet <Integer> set = new HashSet<>();
        for(int i = 0 ; i < nums.length ; i++){
            set.add(nums[i]);
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
        