class Solution {
    public int[] twoSum(int[] number , int target){
        int start = 0;
        int end = number.length-1;
        while(start<end){
            if((number[start] + number[end]) > target){
                end--;
            }else if((number[start] + number[end]) < target){
                start++;
            }
            else{
                return new int[] {start+1 , end +1 };
            }
        }
        return null;
    }
}