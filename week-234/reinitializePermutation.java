//Minimum Number of Operations to Reinitialize a Permutation
class Solution {
    public boolean check(int[] arr){
        for(int i = 0; i < arr.length; i++){
            if(arr[i] != i){return false;}
        }
        return true;
    }
    public int reinitializePermutation(int n) {
        int[] arr = new int[n];
        int[] prem = new int[n];
        for(int i = 0; i < n; i++){
            prem[i] = i;
        }
        boolean done = false;
        int shift = 0;
        int count = 0;
        while(!done){
            for(int i = 0; i < n; i++){
                if(shift == 0){
                    if((i & 1) == 0){arr[i] = prem[i/2];}
                    else{arr[i] = prem[n/2+(i-1)/2];}
                }
                else{
                    if((i & 1) == 0){prem[i] = arr[i/2];}
                    else{prem[i] = arr[n/2+(i-1)/2];}
                }
            }
            count++;
            if(shift == 0){done = check(arr);shift = 1;}
            else{done = check(prem); shift = 0;}
        }
        return count;
    }
}
