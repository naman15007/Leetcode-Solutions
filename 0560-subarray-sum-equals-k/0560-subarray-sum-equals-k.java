class Solution {
    public int subarraySum(int[] nums, int k) {
       HashMap <Integer , Integer> map = new HashMap<>();
       map.put(0,1);
       int prefixsum = 0;
       int ans = 0;
       for(int i = 0 ; i < nums.length ; i++){
        prefixsum += nums[i];
        ans += map.getOrDefault(prefixsum - k , 0);
        map.put(prefixsum , map.getOrDefault(prefixsum , 0 ) + 1);
       }
       return ans;
    }
}