package Array;
class Solution {
    public int lengthOfLastWord(String s) {
        String s1=s.trim();
        int x = s1.length();
        for (int i = x-1; i>=0; i--)
        {
            if (s1.charAt(i) == ' ')
            {
                String abc = s1.substring(i+1, x);
                return abc.length();
            }
            
        }
        return x;
        
    }
}