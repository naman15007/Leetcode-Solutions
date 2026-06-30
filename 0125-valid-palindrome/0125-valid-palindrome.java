class Solution {
    public boolean isPalindrome(String s) {
        String str = s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        String r = new StringBuilder(str).reverse().toString();
        return str.equals(r);
    }
}
