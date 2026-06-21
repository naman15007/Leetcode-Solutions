class Solution {
    public int largestAltitude(int[] gain) {
        int altitude = 0 ;
        int highest = 0;
        for(int gains : gain){
            altitude += gains;
            highest = Math.max(highest,altitude);
        }
        return highest;
    }
}