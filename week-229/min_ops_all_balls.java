//Minimum Number of Operations to Move All Balls to Each Box
class Solution {
    public int[] minOperations(String boxes) {
        char[] str = boxes.toCharArray();
        int len = boxes.length(), i, j;
        int[] ans = new int[len];
        for(i = 0; i < len; i++){
            for(j = 0; j < len; j++){
                if(i == j){continue;}
                if(str[j] == '1'){
                    ans[i]+= Math.abs(i-j);
                }
            }
        }
        return ans;
    }
}
