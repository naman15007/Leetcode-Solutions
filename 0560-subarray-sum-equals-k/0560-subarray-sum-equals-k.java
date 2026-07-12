class Solution {
    public int subarraySum(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>(); // prefixsum value : count
        map.put(0,1);
        int prefixsum = 0;
        int count = 0;
        for(int i : nums){
            prefixsum += i;                                 
            if(map.containsKey(prefixsum - k)){            // 1 1 2 3 5  k = 4
                count += map.get(prefixsum - k);
            }
            map.put(prefixsum,map.getOrDefault(prefixsum,0)+1);
        }
      return count;
    }
}
// 1 2 3
// 1 3 6