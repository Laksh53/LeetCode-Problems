class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i=0;
            for(int j=m;j<m+n;j++)
            {
                if(nums1[j]==0)
                {
                    nums1[j]=nums2[i];
                    if(i<n){
                    i++;}
                }
            }
        
        Arrays.sort(nums1);
        
        
    }
}