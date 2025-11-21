class Solution {
    int[] memo;
    int INF = Integer.MAX_VALUE / 2;

    public int coinChange(int[] coins, int amount) {
        memo = new int[amount + 1];
        Arrays.fill(memo, -1);
        int ans = dfs(amount, coins);
        return ans >= INF ? -1 : ans;
    }

   int dfs(int rem, int[] coins)
   {
    //1. We deal with all the edge case things
    //1.1 if rem is 0 return 0
    if(rem == 0) return 0;
    //1.2 If rem is negative then the branch is inf
    if(rem<0) return INF;
    //1.3 If rem's already been calculated return that
    if(memo[rem]!= -1) return memo[rem];

    //2. Now we go to the "it's never been searched for before case"
    int x = INF;
    for(int i = 0; i<coins.length; i++)
    {
        x = Math.min(x, 1+dfs(rem-coins[i], coins));
    }
    memo[rem] = x;
    return x;
   }
}
