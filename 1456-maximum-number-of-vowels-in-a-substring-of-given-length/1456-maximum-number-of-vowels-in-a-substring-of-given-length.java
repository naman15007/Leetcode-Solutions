class Solution {
    public int maxVowels(String s, int k) {
       int left = 0;
       int right = 0;
       int window = 0;
       int ans = 0;
       for( ; right<k ; right++){
        window += isVowel(s.charAt(right));
       }
       ans = window;

       while(right<s.length()){
        window -= isVowel(s.charAt(left++));
        window += isVowel(s.charAt(right++));
        ans = Math.max(ans, window);
       }
       return ans;
    }
       private int isVowel(char c){
        if(c=='a'|| c=='e' || c=='i' || c=='o'|| c=='u'){
            return 1;
        }
        else{
            return 0;
        }
       }
      
    

}