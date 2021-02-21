//Merge Strings Alternately
class Solution {
    public String mergeAlternately(String word1, String word2) {
        char[] w1 = word1.toCharArray(), w2 = word2.toCharArray();
        int len1 = word1.length(), len2 = word2.length(), i = 0, j = 0, k = 0;
        char[] ans = new char[len1+len2];
        while(i < len1 && j < len2){
            ans[k++] = w1[i++];
            ans[k++] = w2[j++];
        }
        while(i < len1){
            ans[k++] = w1[i++];
        }
        while(j < len2){
            ans[k++] = w2[j++];
        }
        return(new String(ans));
    }
}
