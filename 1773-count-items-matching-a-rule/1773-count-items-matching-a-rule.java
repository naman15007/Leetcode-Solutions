class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int indx = 0;
        if(ruleKey.equals("type")){
            indx = 0;
        }else if (ruleKey.equals("color")){
            indx = 1;
        }else{
            indx = 2;
        }
        int count = 0;
        for(List<String> item : items){
            if(item.get(indx).equals(ruleValue)){
                count++;
            }
        }
        return count;
    }
}