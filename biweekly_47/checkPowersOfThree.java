//Check if Number is a Sum of Powers of Three
class Solution {
    public int log3(int x){
        return (int)(Math.log(x)/Math.log(3));
    }
    public boolean checkPowersOfThree(int n) {
        int pow = log3(n);
        int[] ch = new int[pow+1];
        ch[pow] = 1;
        n = n - (int)Math.pow(3,pow);
        boolean done = true;
        while(n > 0){
            pow = log3(n);
            if(ch[pow] != 1){
                n = n - (int)Math.pow(3,pow);
                ch[pow] = 1;
            }
            else{
                done = false;
                break;
            }
        }
        return done;
    }
}
