class Solution {
    public void reverseString(char[] s) {
    int end=s.length-1;
    int begin=0;

    while(begin<end){
        char temp=s[end];
        s[end]=s[begin];
        s[begin]=temp;

        begin++;
        end--;
    }

    }    
}