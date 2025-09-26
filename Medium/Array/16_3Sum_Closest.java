import java.util.Arrays;
class Solution {
    public int threeSumClosest(int[] nums, int target) 
    {
        int result=0;
        //Store the sums of all triplets in the array
        //Find the difference between each sum and target, if the difference is the smallest, store it in a variable
        //Sort first -  will take too long
        //Sort...
        //Then, do the two pointer thing.
        Arrays.sort(nums);
        int len = nums.length;
        //int sum = 0;
        int sum = nums[0] + nums[1] + nums[2];
        int mindiff = Math.abs(target - sum);
        result = sum;

        for (int i =0; i<len; i++)
        {
            int left = i+1;
            int right = len - 1;
            while (left<right)
            {
                sum =  nums[i]+nums[left]+nums[right];
                int diff = (target>sum)?target-sum:sum-target;
                if (mindiff>diff)
                {
                    mindiff = diff;
                    result = sum;
                }
                if(sum>target)
                {
                    right--;
                }
                else if (sum<target)
                {
                    left++;
                }
                else if (sum == target)
                {
                    return sum;
                }
            }
        }
        return result;
    }
}