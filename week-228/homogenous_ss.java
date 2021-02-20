//Count Number of Homogenous Substrings
class Solution {
    public long num(int n){
        long M = 1000000007;
        long n3 = ((long)(n) * (long)(n + 1)) % M;
        n3 = n3 / 2;
        return n3;
    }
    public int countHomogenous(String s) {
        char[] str = s.toCharArray();
        int len = s.length(), rep = 1, i;
        long sum = 0, M = 1000000007;
        char let = str[0];
        for(i = 1; i < len; i++){
            if(str[i] == let){rep++;}
            else{
                sum = (sum + num(rep)) % M;
                let = str[i];
                rep = 1;
            }
        }
        sum = (sum + num(rep)) % M;
        return ((int)sum);
    }
}
