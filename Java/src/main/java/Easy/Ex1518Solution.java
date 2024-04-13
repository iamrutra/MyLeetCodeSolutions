package Easy;

class Solution1518 {
    public int numWaterBottles(int numBottles, int numExchange) {
        int sum = numBottles;       // 15
        int freeBottles = numBottles;       // 15

        while(true){
            int newBottles = freeBottles / numExchange;     // 3 1
            int x = freeBottles % numExchange;      // 3 2
            sum += newBottles;      //18 19
            freeBottles = newBottles + x;       // 6 3
            if(freeBottles < numExchange){
                break;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Solution1518 sol = new Solution1518();
        System.out.println(sol.numWaterBottles(15,4));
    }
}
