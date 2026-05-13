class Solution {
    public int[] searchRange(int[] nums, int target) {

        ArrayList<Integer> list = new ArrayList<>();

        for (int num : nums) {
            list.add(num);
        }

        int first = list.indexOf(target);

        // target not found
        if (first == -1) {
            return new int[]{-1, -1};
        }

        int last = list.lastIndexOf(target);

        return new int[]{first, last};
    }
}