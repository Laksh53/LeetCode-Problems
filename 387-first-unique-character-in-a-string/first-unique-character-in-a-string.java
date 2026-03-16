class Solution {
    public int firstUniqChar(String s) {
        Map<Character,Integer>map=new LinkedHashMap<>();
        for(char c:s.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
         char key = 0;
        for (Map.Entry<Character, Integer> res : map.entrySet()) {
            if(res.getValue()==1){
                 key = res.getKey();
                 break;
            }
        }
        if (key != 0) {
            return s.indexOf(key);
        } else {
            return -1;
        }
    }
}