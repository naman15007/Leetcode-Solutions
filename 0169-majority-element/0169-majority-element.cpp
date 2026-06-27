class Solution {
public:
    int majorityElement(vector<int>& nums) {
        int fre = 0;
        int majority = 0;
        for(int i : nums){
            if(fre == 0){
                majority = i;
            }
            if(majority == i){
                fre ++;
            }
            else{
                fre -- ;
            }
        }
        return majority;
    }
};