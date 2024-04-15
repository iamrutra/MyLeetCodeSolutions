package Medium;

class Solution2579 {
    public long coloredCells(int n) {
        long sum = 1;
        if(n==1)return sum;
        int startPoint = 4;
        for(int i = 1; i<n; i++){
            sum+=startPoint;
            startPoint+=4;
        }
        return sum;
    }
}
