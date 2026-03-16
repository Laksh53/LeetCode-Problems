class Solution {
    public int findLucky(int[] arr) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        int ans=-1;
        for(Map.Entry<Integer,Integer> res:map.entrySet()){
            int key=res.getKey();
            int value=res.getValue();
            if(key==value){
                ans=Math.max(ans,key);
            }
        }
        return ans;
    }
}