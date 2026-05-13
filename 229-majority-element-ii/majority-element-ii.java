import java.util.*;

class Solution {

    public List<Integer> majorityElement(int[] nums) {

        Map<Integer, Integer> map = new HashMap<>();

        int n = nums.length;

        
        for (int i = 0; i < n; i++) {

            if (map.containsKey(nums[i])) {

                map.put(nums[i], map.get(nums[i]) + 1);

            } else {

                map.put(nums[i], 1);
            }
        }

        List<Integer> ans = new ArrayList<>();

       
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {

            if (entry.getValue() > n / 3) {

                ans.add(entry.getKey());
            }
        }

        return ans;
    }
}