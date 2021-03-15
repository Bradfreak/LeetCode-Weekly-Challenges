//Maximum Score of a Good Subarray
class Solution {
    public int maximumScore(int[] nums, int k) {
        for(int i = k-1; i >= 0; i--){
            nums[i] = Math.min(nums[i],nums[i+1]);
        }
        for(int i = k+1; i < nums.length; i++){
            nums[i] = Math.min(nums[i],nums[i-1]);
        }
        int ans = 0, l = k, r = k;
        for(int i = nums[k]; i >= 0; i--){
            while(l-1 >= 0 && nums[l-1] >= i){l--;}
            while(r+1 <= nums.length-1 && nums[r+1] >= i){r++;}
            ans = Math.max(ans,(r-l+1)*i);
        }
        return ans;
    }
}
