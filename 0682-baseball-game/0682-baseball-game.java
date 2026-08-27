class Solution {
    public int calPoints(String[] operations) {
        int totalsum = 0 ;
        Stack <Integer> st = new Stack<>();
        for(int i = 0 ; i < operations.length ; i++){
         String number = operations[i];
         if(number.equals("D")){
            st.push(2*st.peek());
         }else if(number.equals("C")){
            st.pop();
         }else if(number.equals("+")){
            int val1 = st.pop();
            int val2 = st.peek();
            int sum = val1 + val2;
            st.push(val1);
            st.push(sum);
         }else{
            st.push(Integer.parseInt(number));
         }
        }
        while(st.size()>0){
                totalsum += st.pop();
        }
        return totalsum;
    }
}