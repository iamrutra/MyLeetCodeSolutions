package Easy;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

class Solution2215 {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {

        Set<Integer> uniqueInNums1 = new HashSet<>(IntStream.of(nums1).boxed().collect(Collectors.toList())); // Efficient conversion to Integer set
        Set<Integer> uniqueInNums2 = new HashSet<>(IntStream.of(nums2).boxed().collect(Collectors.toList()));

        List<Integer> result1 = new ArrayList<>(); // List for elements unique to nums1
        List<Integer> result2 = new ArrayList<>(); // List for elements unique to nums2

        for (int num : nums1) {
            if (!uniqueInNums2.contains(num) && !result1.contains(num)) { // Check if num exists only in nums1
                result1.add(num);
            }
        }

        for (int num : nums2) {
            if (!uniqueInNums1.contains(num) && !result2.contains(num)) { // Check if num exists only in nums2
                result2.add(num);
            }
        }

        // Directly return the constructed lists as the result
        return Arrays.asList(result1, result2);
    }
}

class __DriverSolution__ {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 3};
        int[] nums2 = {1, 1, 2, 2};

        Solution2215 sol = new Solution2215(); // Create an instance of Solution2215
        List<List<Integer>> result = sol.findDifference(nums1, nums2);
        System.out.println("Result: " + result);
    }
}