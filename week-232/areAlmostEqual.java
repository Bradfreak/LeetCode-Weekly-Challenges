//Check if One String Swap Can Make Strings Equal
class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        if(s1.length() == 1){
            if(!s1.equals(s2)){return false;}
            else{return true;}
        }
        if(s1.length() == 2){
            if(s1.equals(s2)){return true;}
            else if(s1.charAt(0) == s2.charAt(1) && s1.charAt(1) == s2.charAt(0)){return true;}
            else{return false;}
        }
        int count = 0;
        char[] c = new char[4];
        boolean ans = true;
        for(int i = 0; i < s1.length(); i++){
            if(s1.charAt(i) != s2.charAt(i)){
                if(count == 2){
                    ans = false;
                    break;
                }
                c[count] = (char)s1.charAt(i);
                c[count+2] = (char)s2.charAt(i);
                count++;
            }
        }
        System.out.println(c);
        if(ans == false){return false;}
        else{
            if(count == 0){return true;}
            else if(count == 1){return false;}
            else{
                if(c[0] == c[3] && c[1] == c[2]){return true;}
                else{return false;}
            }
        }
    }
}
