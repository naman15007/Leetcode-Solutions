import java.util.*;      
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> uniquetriplet = new HashSet<>();            //[-1,0,1,2,-1,-4] nums
        for(int i = 0; i < nums.length ; i++){
            int target = - nums[i]; // nums[i] = a      
            HashSet<Integer> set = new HashSet<>();
            for(int j = i+1 ; j < nums.length ; j++){  // b = value
            int third = target - nums[j]; /// third = value
            
            if(set.contains(third)){
                List <Integer> triplet = new ArrayList<>();
                triplet.add(nums[i]); // a
                triplet.add(nums[j]); // b
                triplet.add(third);// c

                Collections.sort(triplet);
                uniquetriplet.add(triplet);
            }
            set.add(nums[j]);
            }
        }
        return new ArrayList<>(uniquetriplet);
    }
}