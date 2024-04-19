package Easy;

import java.util.*;

class Ex1331Solution {
    public int[] arrayRankTransform(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        int[] arr2 = arr.clone();
        Arrays.sort(arr2);

        int j = 1;
        for (int k : arr2) {
            if (!map.containsKey(k)) {
                map.put(k, j++);
            }
        }
        for(int i = 0; i < arr2.length; i++){
            arr2[i] = map.get(arr[i]);
        }
        return arr2;
    }

    public static void main(String[] args) {
        Ex1331Solution sol = new Ex1331Solution();
        int[] arr = {4,1,2,3};
        System.out.println(Arrays.toString(sol.arrayRankTransform(arr)));
    }
}

