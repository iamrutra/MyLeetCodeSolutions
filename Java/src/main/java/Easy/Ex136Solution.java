package Easy;

import java.util.Arrays;

class Ex136Solution {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        for (int i = 0; i < nums.length - 1; i+=2) {
            if(nums[i] != nums[i+1]) return nums[i];
        }
        return nums[nums.length-1];
    }

    public static void main(String[] args) {
        Ex136Solution solution = new Ex136Solution();
        System.out.println(solution.singleNumber(new int[]{4,1,2,1,2}));
    }
}
