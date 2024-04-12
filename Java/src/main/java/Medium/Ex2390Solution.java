package Medium;
import java.util.Stack;

class Solution2390 {
    public String removeStars(String s) {
        Stack<Character> st = new Stack<>();

        for(int i = 0; i<s.length(); i++){
            if(s.charAt(i)!='*'){
                st.push(s.charAt(i));
            }
            else{
                if(!st.isEmpty()) st.pop();
            }
        }

        String ans = "";
        for(char ch:st){
            ans+=ch;
        }
        return ans;
    }
}