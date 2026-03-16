class Solution {
    public int maxVowels(String s, int k) {
        HashSet<Character> set = new HashSet<>();
        set.add('a');
        set.add('e');
        set.add('i');
        set.add('o');
        set.add('u');
        int count = 0;
        int max = 0;
        for(int i = 0; i < s.length(); i++){
            if(set.contains(s.charAt(i))){
                count++;
            }
            if(i >= k){
                if(set.contains(s.charAt(i-k))){
                    count--;
                }
            }
            max = Math.max(max, count);
        }
        return max;
    }
}