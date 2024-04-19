package Easy;

import java.util.HashSet;
import java.util.Set;

class Ex1805Solution {
    public int numDifferentIntegers(String word) {
        int l = word.length();
        char[] arr = word.toCharArray();
        if ((arr[0] == '0' && arr[1] <= '9') || arr[0] > '9') {
            arr[0] = ' ';
        }


        for(int i = 0; i < l; i++) {
            if (arr[i] == '0' && arr[i - 1] == ' ' || arr[i] > '9') {
                arr[i] = ' ';
            }
        }
        System.out.println(arr);

        Set<String> set = new HashSet<>();
        StringBuilder sb = new StringBuilder();

        for(char c : arr) {
            if(c != ' ') {
                sb.append(c);
            }
            else if(!sb.isEmpty()){
                set.add(sb.toString());
                sb = new StringBuilder();
            }
        }
        if(!sb.isEmpty()) {
            set.add(sb.toString());
        }
        return set.size();
    }

    public static void main(String[] args) {
        Ex1805Solution sol = new Ex1805Solution();
        System.out.println(sol.numDifferentIntegers("a123bc34d8ef34"));
        System.out.println(sol.numDifferentIntegers("a1b01c001"));
    }
}
