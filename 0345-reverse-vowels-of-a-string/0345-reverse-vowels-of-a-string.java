class Solution {
    public String reverseVowels(String s) {
      char [] chars = s.toCharArray();
      int start = 0;
      int end = s.length()-1;
      String vowel = "aeiouAEIOU";
      while(start < end){
        while(start < end && vowel.indexOf(chars[start]) == -1){
          start++;
        }
        while(start < end && vowel.indexOf(chars[end]) == -1){
          end--;
        }
        char temp = chars[start];
        chars[start] = chars[end];
        chars[end] = temp;

        start++;
        end--;
      }
      return new String(chars);
    }
}