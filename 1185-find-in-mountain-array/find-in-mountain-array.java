/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
class Solution {
    public static int findpeek( MountainArray mountainArr,int n){
        int left=0;
        int right = n-1;
        while(left<right){
            int mid=(left+right)/2;
            if(mountainArr.get(mid)<mountainArr.get(mid+1))
            left=mid+1;
            else
            right = mid;
        }
        return left;
    }
    static int binarysearch(MountainArray mountainArr,int target,int start,int end,boolean increasing){
        while(start<=end){
            int mid=(start+end)/2;
            int midelement=mountainArr.get(mid);
            if(midelement==target){
                return mid;
            } 
            if((increasing && midelement<target) || (!increasing && midelement>target)){
                start = mid+1;
            }
            else{
                end = mid-1;
            }

        }
        return -1;
    }
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int n=mountainArr.length();
        int peek = findpeek(mountainArr,n);
        int result = binarysearch(mountainArr,target,0,peek,true);
        if(result!=-1)
        return result;
        return binarysearch(mountainArr,target,peek+1,n-1,false);
    }
}