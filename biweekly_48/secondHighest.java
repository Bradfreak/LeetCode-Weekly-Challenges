//Second Largest Digit in a String
class Solution {
    public int secondHighest(String s) {
        int max = Integer.MIN_VALUE, max2 = Integer.MIN_VALUE;
        char[] s1 = s.toCharArray();
        for(char i: s1){
            System.out.println(max+" "+max2);
            if(Character.isDigit(i)){
                if((int)i-48 > max){
                    max2 = max;
                    max = (int)i - 48;
                }
                else if((int)i-48 > max2 && (int)i-48 != max){max2 = (int)i - 48;}
            }
        }
        if(max2 == Integer.MIN_VALUE){return -1;}
        return max2;
    }
}
