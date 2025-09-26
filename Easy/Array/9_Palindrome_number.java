class Solution {
    public boolean isPalindrome(int x) {
       int y = x;
        int reversed =0;
        while(x>0)
        {
            reversed = reversed*10 + x%10;
            x/=10;
        }
        if ( y == reversed)
        {
            return true;
        }
        else
        {
            return false;
        }
        
    }
}