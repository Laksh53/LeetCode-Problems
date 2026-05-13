import java.util.*;

class Solution {

    public int[] topKFrequent(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();

        // count frequency
        for (int num : nums) {

            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // store entries in list
        List<Map.Entry<Integer, Integer>> list =
                new ArrayList<>(map.entrySet());

        // sort based on frequency descending
        list.sort((a, b) -> b.getValue() - a.getValue());

        int[] ans = new int[k];

        for (int i = 0; i < k; i++) {

            ans[i] = list.get(i).getKey();
        }

        return ans;
    }
}