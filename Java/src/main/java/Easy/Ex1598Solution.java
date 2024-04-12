package Easy;

import java.util.Arrays;

class Solution1598 {
    static final String PARENT_DIR = "../";
    static int checkPath(String[] path){
        int main = 0;
        for(String pth : path){
            if(main!=0 && pth.equals(PARENT_DIR)) main--;
            else if(!pth.startsWith(".")) main++;
        }
        return main;
    }
    public int minOperations(String[] logs) {
        if (logs == null) return 0;
        return checkPath(logs);
    }
}
