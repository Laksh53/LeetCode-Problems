class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {

        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> result = new ArrayList<>();

        // store nums2 elements
        for (int num : nums2) {
            list.add(num);
        }

        // check nums1 elements
        for (int num : nums1) {

            if (list.contains(num)) {

                result.add(num);

                // remove matched element
                list.remove(Integer.valueOf(num));
            }
        }

        int[] ans = new int[result.size()];

        for (int i = 0; i < result.size(); i++) {
            ans[i] = result.get(i);
        }

        return ans;
    }
}