package Easy;

class Solution {
    public int smallestEvenMultiple(int n) {
        if(n%2==0) return n;
        n*=2;
        return n;
    }
}
