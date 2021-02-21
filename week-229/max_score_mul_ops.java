//Maximum Score from Performing Multiplication Operations
class Solution {
    public int rec(int len, int start, int end, int m, int pres, int[] nums, int[] mul, int[][] dp){
        if(pres == m){
            return 0;
        }
        else if(dp[start][len-end] == 0){
            dp[start][len-end] = Math.max((nums[start] * mul[pres])+rec(len,start+1,end,m,pres+1,nums,mul,dp)
                                          ,(nums[end] * mul[pres])+rec(len,start,end-1,m,pres+1,nums,mul,dp));
        }
        return dp[start][len-end];
    }
    public int maximumScore(int[] nums, int[] mul) {
        int n = nums.length, m = mul.length;
        int[][] dp = new int[1001][1001];
        int ans = rec(n,0,n-1,m,0,nums,mul,dp);
        return ans;
    }
}
