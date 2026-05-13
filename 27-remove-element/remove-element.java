import java.util.*;

class Solution {
    public int removeElement(int[] nums, int val) {
        ArrayList<Integer> n = new ArrayList<>();

        for(int i = 0; i < nums.length; i++) {
            if(nums[i] != val) {
                n.add(nums[i]);
            }
        }

        for(int i = 0; i < n.size(); i++) {
            nums[i] = n.get(i);
        }

        return n.size();
    }
}