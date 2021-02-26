//Form Array by Concatenating Subarrays of Another Array
class Solution {
    public boolean canChoose(int[][] groups, int[] nums) {
        int glen = groups.length, len = nums.length, done = 0, pres = 0, i, j = 0;
        for(i = 0; i < len && pres < glen; i++){
                if(groups[pres][j] == nums[i]){
                    j++;
                }
                else{
                    if(j != 0){
                        j = 0;
                        i--;
                    }
                }
                if(j==groups[pres].length){
                    pres++;
                    j = 0;
                    done++;
                }
        }
        if(done == glen){return true;}
        else{return false;}
    }
}
