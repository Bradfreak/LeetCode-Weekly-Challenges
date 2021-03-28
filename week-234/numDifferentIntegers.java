//Number of Different Integers in a String
class Solution {
    public int numDifferentIntegers(String word) {
        char[] s = word.toCharArray();
        int temp = -1;
        HashSet<Integer> all = new HashSet<Integer>();
        boolean prevInt = false;
        for(int i = 0; i < s.length; i++){
            if(Character.isDigit(s[i]) && !prevInt){
                prevInt = true;
                temp = (int)s[i]-48;
            }
            else if(Character.isDigit(s[i]) && prevInt){
                temp = (temp*10)+(int)s[i]-48;
            }
            else if(!Character.isDigit(s[i]) && prevInt){
                all.add(temp);
                temp = -1;
                prevInt = false;
            }
        }
        if(temp != -1){
            all.add(temp);
        }
        return all.size();
    }
}
