//Count Items Matching a Rule
class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int check;
        if(ruleKey.equals("type")){check = 0;}
        else if(ruleKey.equals("color")){check = 1;}
        else{check = 2;}
        int ans = 0;
        for(List<String> i : items){
            if(i.get(check).equals(ruleValue)){
                ans++;
            }
        }
        return ans;
    }
}
