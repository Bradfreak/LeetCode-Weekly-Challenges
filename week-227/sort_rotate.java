class Solution {
    public boolean check(int[] nums) {
        int[] sor = nums.clone();
        Arrays.sort(sor);
        int len = nums.length, mindex = 0, mi = Integer.MAX_VALUE, i;
        for(i = 0; i < len; i++){
            if(mi > nums[i]){
                mi = nums[i];
                mindex = i;
            }
            else if(mi == nums[i]){
                if(nums[i-1] > mi){
                    mi = nums[i];
                    mindex = i;
                }
            }
        }
        System.out.println(mindex);
        mi = 1;
        for(i = 0; i < len; i++){
            if(sor[i] != nums[mindex]){
                mi = 0;
                break;
            }
            mindex++;
            if(mindex == len){
                mindex = 0;
            }
        }
        if(mi == 1){
            return(true);
        }
        else{
            return(false);
        }
    }
}
