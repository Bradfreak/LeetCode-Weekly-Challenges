class Solution {
    public int maximumScore(int a, int b, int c) {
        int sum = a+b+c;
        int ma = c > (a > b ? a : b) ? c : ((a > b) ? a : b);
        sum = sum - ma;
        int point;
        if(sum > ma){
            point = ma;
            sum = (sum - ma)/2;
            point = point + sum;
        }
        else if(sum < ma){
            point = sum;
        }
        else{
            point = ma;
        }
        return(point);
    }
}
