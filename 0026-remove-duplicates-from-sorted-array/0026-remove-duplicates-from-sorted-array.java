class Solution {
    public int removeDuplicates(int[] nums) {
        Set<Integer> set = new LinkedHashSet<>();
        for(int num : nums){
            set.add(num);
        }
        int count = 0;
        for(int num : set){
            nums[count] = num;
            count++;
        }
        return count;
    }
}