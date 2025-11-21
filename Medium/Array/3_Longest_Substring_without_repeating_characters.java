package Medium.Array;
class Solution 
{
    public int lengthOfLongestSubstring(String s) 
    {
        int x = s.length();
        int maxLen = 0;
        HashMap<Character, Integer> set = new HashMap<>();
        int m = 0;
        for (int i = 0; i< x; i++)
        {
            if (set.containsKey(s.charAt(i)))
            {
                int max = set.size();
                char c = s.charAt(i);
                while (m<i && set.containsKey(c))
                {
                    set.remove(m);
                    m++;
                }
               
                set.put(s.charAt(i), i);
                if (max > maxLen) maxLen = max;
            }
            else
            {
                set.put( s.charAt(i), i);
                if (maxLen<set.size()) maxLen = set.size();
            }
        }
        return maxLen;
        
    }
}