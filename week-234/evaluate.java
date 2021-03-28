//Evaluate the Bracket Pairs of a String
class Solution {
    public String evaluate(String s, List<List<String>> knowledge) {
        HashMap<String, String> know = new HashMap<String, String>();
        for(List<String> i: knowledge){
            know.put(i.get(0),i.get(1));
        }
        Stack<Integer> st = new Stack<Integer>();
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '('){
                st.push(i);
            }
            else if(s.charAt(i) == ')'){
                int sr = st.pop();
                String temp = s.substring(sr+1,i);
                if(know.containsKey(temp)){temp = know.get(temp);}
                else{temp = "?";}
                s = s.substring(0,sr)+temp+s.substring(i+1);
                i = sr+temp.length()-1;
            }
        }
        return s;
    }
}
