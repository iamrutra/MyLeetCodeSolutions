package Easy;

import java.lang.reflect.Array;
import java.util.*;


class Solution26 {
    public int removeDuplicates(int[] nums) {
        int x = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[x] = nums[i];
                x++;
            }
        }
        return x;
    }


    public static void main(String[] args) {
        Solution26 sol = new Solution26();
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        System.out.println(sol.removeDuplicates(nums));
    }
}
