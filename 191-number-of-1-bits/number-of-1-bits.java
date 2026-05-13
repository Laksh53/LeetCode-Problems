class Solution {
    static String covertDecimalToBinary(int num) {
        String result="";
        while(num>=1){
            result=num%2+result;
            num=num/2;
        }

        return result;
    }
    static int countOf1(String binary)
    {
        int count=0;
        for(int i=0;i<=binary.length()-1;i++)
        {
            char ch=binary.charAt(i);
            if(ch=='1')
            {
                count+=1;
                
            }
            
        }
        return count;
    }
    public int hammingWeight(int n) {
        String binary=covertDecimalToBinary(n);
        int count=countOf1(binary);
        return count;

        
    }
}