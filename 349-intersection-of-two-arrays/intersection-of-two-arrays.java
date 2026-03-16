class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set1=new HashSet<>();
        for(int num1:nums1){
            set1.add(num1);
        }
        Set<Integer> set2=new HashSet<>();
        for(int num2:nums2){
           if(set1.contains(num2)){
            set2.add(num2);
           }
        }
        int[] ans=new int[set2.size()];
        int i=0;
        for(int val:set2){
            ans[i]=val;
            i++;
        }
        return ans;
    }
}