class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int [] pfs = new int[n]; // 1 , 2 , 8, 6
        int [] pfe = new int[n]; // 48 , 48 , 24 , 6
        int [] ans = new int[n]; // 48 , 24 , 12 , 8
        pfs[0] = nums[0];
        for(int i = 1 ; i < n ;i++){
            pfs[i] = nums[i] * pfs[i-1];
        }
        pfe[n-1] = nums[n-1];
        for(int i = n-2 ; i >= 0 ; i--){
            pfe[i] = nums[i] * pfe[i+1];
        }
        ans[n-1] = pfs[n-2];
        ans[0] = pfe[1];
        for(int i  = 1 ; i < n-1 ; i++){
            ans[i] = pfs[i-1] * pfe[i+1];
        }
        return ans;
    }
}  
