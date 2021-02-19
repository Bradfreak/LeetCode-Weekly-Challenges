//Minimum Changes To Make Alternating Binary String
class Solution {
    public int minOperations(String s) {
        int len = s.length(), ans1 = 0, ans2 = 0, i, alt = 0;
        char[] str = s.toCharArray();
        for(i = 0; i < len; i++){
            if(str[i] == '0'){
                if(alt == 0){
                    ans2++;
                    alt = 1;
                }
                else{
                    ans1++;
                    alt = 0;
                }
            }
            else{
                if(alt == 0){
                    ans1++;
                    alt = 1;
                }
                else{
                    ans2++;
                    alt = 0;
                }
            }
        }
        return(Math.min(ans1,ans2));
    }
}
