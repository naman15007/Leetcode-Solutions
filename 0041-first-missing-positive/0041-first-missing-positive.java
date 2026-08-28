class Solution {
    public int firstMissingPositive(int[] nums) {
        Arrays.sort(nums);
        int missingno = 1;
        for(int num : nums){
            if(num > 0){
                if(num == missingno){
                    missingno++;
                }
                if(num > missingno){
                    break;
                }
            }
        }
        return missingno;
    }
}