class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int []a=nums1;
        int []b=nums2;
        int[] c = new int[a.length + b.length];
        System.arraycopy(a, 0, c, 0, a.length);
        System.arraycopy(b, 0, c, a.length, b.length);

        // Sort the concatenated array
        Arrays.sort(c);
        
        // Calculate and return the median
        int n = c.length;
        if(n%2==1)
        {
            return c[n/2];
        }
        else{
        int mid1 = n / 2;
        int mid2 = mid1 - 1;
        return (c[mid1] + c[mid2]) / 2.0;}
        
    }
}