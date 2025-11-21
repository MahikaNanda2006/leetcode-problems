class Solution 
{
    int maxLen =1;
    public int findLengthOfLCIS(int[] nums) 
    {
        if (nums.length == 0) maxLen = 0;
        
        int max= 1;
        for(int i = 0; i<nums.length-1; i++)
        {
            if(nums[i]<nums[i+1])
            {
                max++;
            }
            else
            {
                if(maxLen< max) maxLen = max;
                max = 1;
            }
        }
        if(maxLen< max) maxLen = max;
        return maxLen;
           
    }
}