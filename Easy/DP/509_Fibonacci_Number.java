class Solution 
{
    int[] memo;
    public int fib(int n) 
    {
        memo = new int[n+1];
        Arrays.fill(memo, -1);
        memo[0] = 0; 
        if(n+1>1) memo[1] = 1;
        
        
        for(int i = 2; i<=n; i++)
        {
            memo[i] = helper(i);
        }
        return memo[n];
        
    }
    int helper(int n)
    {
        if(memo[n]!= -1) return memo[n];
        return (helper(n-1)+helper(n-2)); 
    }
}