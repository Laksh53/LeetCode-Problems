class Solution {
    public boolean isValid(String word) {
       int n = word.length();
       if(n<3)
       {
        return false;
       }
       boolean vowel=false;
       boolean consonent=false;
       for(char c:word.toCharArray())
       {
        if(!Character.isLetterOrDigit(c))
        {
            return false;
        }
        if(Character.isLetter(c))
        {
            char ch=Character.toLowerCase(c);
            if(ch=='a'|| ch=='e' || ch=='i'|| ch=='o'|| ch=='u')
            {
                vowel = true;
            }
            else
            {
                consonent = true;
            }
        }
    
       }
       return vowel && consonent;
    }
}