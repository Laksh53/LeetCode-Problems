class Solution {
     static String covertDecimalToBinary(int num) {
        String result="";
        while(num>=1){
            result=num%2+result;
            num=num/2;
        }

        return result;
    }
    static String reverseBinary(String binary)
    {
        String reverse="";
        for(int i=binary.length()-1;i>=0;i--)
        {
            reverse=reverse+ binary.charAt(i);
        }
        return reverse;

    }
    static String to32BitBinary(String binary) {
  
    if (binary.length() < 32) {
        int zerosNeeded = 32 - binary.length();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < zerosNeeded; i++) {
            sb.append("0");
        }

        sb.append(binary);
        return sb.toString();
    }

    return binary;
}

    static int convertBinarytoDecimal(String num) {
        // Alternative methods are given inside the comment lines.
        int result=0;
        int power=0;//int power=1;
        for(int i=num.length()-1;i>=0;i--){
            if(num.charAt(i)=='1'){
                result+= (int) Math.pow(2,power);// result+=power;
            }
            power++;//power*=2;

        }
        return result;
    }
    public int reverseBits(int n) {
        String binary =covertDecimalToBinary(n);
        String bit=to32BitBinary(binary);
        String reversedBInary=reverseBinary(bit);
        int result=convertBinarytoDecimal(reversedBInary);
        return result;


    }
}