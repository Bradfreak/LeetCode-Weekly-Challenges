//Check if Binary String Has at Most One Segment of Ones
class Solution {
    public boolean checkOnesSegment(String s) {
        char[] s1 = s.toCharArray();
        char ch = '1';
        for(int i = 0; i < s1.length; i++){
            if(i == 0 && s1[i] != ch){
                return false;
            }
            else if(i != 0 && s1[i] == '0'){
                ch = '0';
            }
            else if(i != 0 && s1[i] != ch){
                return false;
            }
        }
        return true;
    }
}
