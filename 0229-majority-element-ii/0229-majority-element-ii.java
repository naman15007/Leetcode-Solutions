class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap <Integer , Integer > map = new HashMap<>();
        for(int num : nums){
            map.put(num , map.getOrDefault(num , 0) + 1);
        }
        ArrayList<Integer> list = new ArrayList<>();
        for(int x : map.keySet()){
            if(map.get(x) > nums.length / 3){
                list.add(x);
            }
        }
        return list;
    }
}