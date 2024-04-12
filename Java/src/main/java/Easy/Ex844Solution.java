package Easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

class Solution844 {

    void checkstack(String s, Stack<Character> stk, int k){
        for(int i = 0; i<k; i++){
            if(s.charAt(i)!='#'){
                stk.push(s.charAt(i));
            }
            else{
                if(!stk.isEmpty()){
                    stk.pop();
                }
            }
        }
    }
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> st1 = new Stack<>();
        Stack<Character> st2 = new Stack<>();

        int sL = s.length();
        int tL = t.length();
        checkstack(s,st1,sL);
        checkstack(t,st2,tL);

        if(st1.equals(st2)){
            return true;
        }
        return false;
    }
        public static void main(String[] args) {
            Solution844 sol = new Solution844();
            String s = "ab#c";
            String t = "ad#c";

            System.out.println(sol.backspaceCompare(s,t));
    }
}

