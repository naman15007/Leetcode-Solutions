class Solution {
    public int longestOnes(int[] nums, int k) {
        int left = 0;
        int window = 0;
        int ans = 0;
        int right = 0;
                for (; right< nums.length ; right++){
            window += nums[right];
        
        while(window + k < right-left+1){
            window -= nums[left]; 
            left++;
        }
        ans = Math.max(ans, right - left + 1);
        }
        return ans;
    
    }
}