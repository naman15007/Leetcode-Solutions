class Solution {
    public int[] sortArray(int[] nums) {
        int min = nums[0] , max = nums[0];
        Map <Integer , Integer> map = new HashMap<>();
        for(int num : nums){
            if(map.containsKey(num)){
                map.put(num , map.get(num) + 1);
            }else{
            map.put(num , 1);
            }
            if(num < min){
                min = num;
            }
            if(num > max){
                max = num;
            }
        }
        int index = 0;
        for(int i = min ; i <= max ; i++){
            while(map.getOrDefault(i,0) > 0){
                nums[index] = i;
                index++;
                map.put(i , map.get(i) - 1);
            }
        }
        return nums; 
    }
}