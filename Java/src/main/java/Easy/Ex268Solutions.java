package Easy;


import java.util.Arrays;

class Ex268Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;

        if (nums[0] != 0) return 0;

        if (nums[n - 1] != n) return n;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != i) return i;
        }

        return 0;
    }

    public static void main(String[] args) {
        Ex268Solution solution = new Ex268Solution();
        int[] nums = {9,6,4,2,3,5,7,0,1};
        System.out.println(solution.missingNumber(nums));
    }
}
