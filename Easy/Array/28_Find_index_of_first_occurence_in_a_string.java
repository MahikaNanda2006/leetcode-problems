class Solution {
    public int strStr(String haystack, String needle) {
        int x = haystack.length();
        int left = 0;
        int y = needle.length();
        int right = left+y;
        int counter =0;
    
        while(left<=x-y)
        {
            if (haystack.substring(left, right).equals(needle))
            {
                return left;
            }
            left++;
            right++;
            
        }

        return -1;
        
    }
}