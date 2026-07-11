class Solution {
    public String reverseOnlyLetters(String s) {
     int left = 0;
     int right = s.length() - 1;
     char [] str = s.toCharArray();
     while(left < right){
        if(isEnglish(str[left])){
            while(!isEnglish(str[right])){
                right--;
            }
            char temp = str[left];
            str[left] = str[right];
            str[right] = temp;
            right--;
        }
        left++;
     }
     return new String(str);
    }



     public boolean isEnglish(char ch){
        if(ch >= 65 && ch<= 90 ||  ch>= 97 && ch<=122){
            return true;
        } 

        else{
            return false;
        }
     }
     }