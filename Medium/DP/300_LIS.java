class Solution {
    int[] dp;
    public int lengthOfLIS(int[] nums) 
    {
        int maxLen = 0;
        int n = nums.length;
        dp = new int[n];
        Arrays.fill(dp, -1);
        for(int i = 0; i<n; i++)
        {
            maxLen = Math.max(maxLen, recurse(i,n, nums));
        }
        return maxLen;
        
    }
    int recurse(int i, int n, int[] nums)
    {
        if(dp[i]!=-1) return dp[i];
        dp[i] = 1;
        for(int j = i; j<n; j++)
        {
            if(nums[i]<nums[j])
            {
                dp[i] = Math.max(dp[i], 1 + recurse(j, n, nums));
            }
        }
        return dp[i];

    }
    
}