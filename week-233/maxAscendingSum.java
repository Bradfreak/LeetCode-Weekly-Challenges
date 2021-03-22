//Maximum Ascending Subarray Sum
class Solution {
    public int maxAscendingSum(int[] nums) {
        int sum = nums[0], maxs = nums[0];
        for(int i = 1; i < nums.length; i++){
            if(nums[i] <= nums[i-1]){
                sum = nums[i];
            }
            else{
                sum += nums[i];
            }
            maxs = Math.max(maxs,sum);
        }
        return maxs;
    }
}
