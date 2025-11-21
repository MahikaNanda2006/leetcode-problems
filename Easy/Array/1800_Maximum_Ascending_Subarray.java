class Solution 
{
    public int maxAscendingSum(int[] nums) 
    {
        int maxLen = nums[0];
        int maxSum = nums[0];
        for(int i = 1; i<nums.length ; i++)
        {
            if(nums[i-1]<nums[i]) maxLen = maxLen+nums[i];
            else
            {
                if(maxLen < nums[i]) maxLen = nums[i];
                if(maxSum<maxLen) maxSum = maxLen;
                maxLen = nums[i];
            }
        }
        if(maxSum<maxLen) maxSum = maxLen;
        return maxSum;

    }
}