class Solution 
{
    int[] sum;
    public int climbStairs(int n) 
    {
        sum = new int[n+1];
        Arrays.fill(sum, -1);
        sum[0] = 1;
        if(n>0) sum[1] = 1;
        for(int i = 2; i<n+1; i++)
        {
            sum[i] = recurse(i); 
        }
        
        return sum[n];
        
    }
    int recurse(int n)
    {
        if (sum[n]!= -1) return sum[n];
        return (recurse(n-1)+recurse(n-2));
    }
}