class Solution 
{
    int dp[];
    public int maxSubArray(int[] nums) 
    {
        //Using Kadane's algortihm
        //The basic idea is that at each number, we have only two choices. 
        //1.Either you start at a new subarray
        //2.Or you continue the existing subarray
        int maxLen = nums[0];
        int maxSum = nums[0];
        for (int i = 1; i<nums.length; i++)
        {
            if(maxLen+nums[i]<nums[i]) maxLen =  nums[i];
            else maxLen = maxLen+nums[i];
            if(maxSum < maxLen) maxSum = maxLen;
        }
        return maxSum;
        
    }
    
}