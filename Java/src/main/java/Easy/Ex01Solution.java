package Easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class Solution01 {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i<nums.length; i++){
            int numToFind = target - nums[i];
            if(map.containsKey(numToFind)){
                return new int[]{map.get(numToFind), i};
            }
            map.put(nums[i], i);
        }
        return new int[0];
    }

    public static void main(String[] args) {
        Solution01 sol = new Solution01();
        int[] nums = {2,7,11,15};
        int target = 9;
        System.out.println(Arrays.toString(sol.twoSum(nums, target)));
    }
}
