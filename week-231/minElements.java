//Minimum Elements to Add to Form a Given Sum
class Solution {
    public int minElements(int[] nums, int limit, int goal) {
        long sum = 0;
        for(int i : nums){
            sum += (long)i;
        }
        if((long)goal == sum){return 0;}
        long dif = (long)goal - sum;
        int ans = 0, c;
        long l;
        dif = Math.abs(dif);
        while(dif > 0){
            if(dif > limit){
                c = 0; l = (long)limit;
                while(dif > l){
                    l = l << 1;
                    c++;
                }
                dif -= (l >> 1);
                ans += (1 << (c-1));
            }
            else if(dif <= (long)limit){
                dif = 0;
                ans++;
            }
        }
        return ans;
    }
}
