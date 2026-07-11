class Solution {
    public String reverseOnlyLetters(String s) {
     int left = 0;
     int right = s.length()-1;
     char [] ch = s.toCharArray();   
     while(left < right){
        if(isEnglish(ch[left])){
            while(!isEnglish(ch[right])){
                right--;
            }
            char temp = ch[left];
            ch[left] = ch[right];
            ch[right] = temp;
            right--;
        }
        left++;
     }
    return new String(ch);
    }
      public boolean isEnglish(char c){
        return (c >= 65 && c <= 90) || (c >= 97 && c <= 122);
    }
}