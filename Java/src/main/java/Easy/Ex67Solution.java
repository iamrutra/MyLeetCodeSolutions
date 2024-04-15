package Easy;

class Solution67 {
    public int findLengthOfLCIS(int[] nums) {
        int l = 1;
        int res = -1;
        for (int i = 0; i<nums.length-1; i++){
            if(nums[i] < nums[i+1]) l++;
            else l = 1;
            res = Math.max(res,l);
        }
        return res;
    }
}
