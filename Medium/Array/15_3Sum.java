package Medium.Array;
import java.util.Arrays;
import java.util.ArrayList;
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int x = nums.length;
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        for (int i=0; i<x; i++)
        {
            if (i > 0 && nums[i] == nums[i - 1]) continue;

            //Now, this becomes a two sum problem
            int left = i+1;
            int right = x-1;
            
            while(left<right)
            {
                
                    if(nums[left]+nums[right]+nums[i] < 0)
                    {
                        left++;
                    }
                    else if(nums[left]+nums[right]+nums[i] > 0)
                    {
                        right--;
                    }
                    else
                    {
                        result.add(Arrays.asList(nums[i], nums[left], nums[right]));
                        while (left<right && nums[left]==nums[left+1]) left++;
                        while (right>left && nums[right]==nums[right-1]) right--;
                        left++;
                        right--;
                    }
                
            }
        }
        return result;
        
    }
}