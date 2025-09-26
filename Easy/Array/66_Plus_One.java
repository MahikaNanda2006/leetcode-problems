
class Solution {
    public int[] plusOne(int[] digits)
    {
        int x = digits.length;
        for (int i= x-1 ; i>=0; i--)
        {
            if (digits[i] < 9)
            {
                digits[i]++;
                return digits;
            }
            digits[i]=0;
        }
        //if we made it through the loop, we have all 9s, therefore just add 1 to the digits.
        int[] arr = new int[x+1];
        arr[0]=1;
        for (int i=1; i<x+1; i++)
        {
            arr[i] = 0;
        }
        return arr;
    } 
}