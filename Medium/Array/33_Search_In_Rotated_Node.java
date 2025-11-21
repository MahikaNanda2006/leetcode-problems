class Solution 
{
    public int search(int[] nums, int target) 
    {
        int len = nums.length; 
        int left = 0; 
        int right = len-1;
        while (left<=right)
        {
            int mid = left + (right - left)/2;
            if (nums[mid] == target) return mid;
            //Now, the first thing to do is determine which half is sorted
            if (nums[left]<=nums[mid])
            {
                //This means the part to the left HAS to be sorted
                //So we can just perform a binary search in the left part
                if(nums[left]<=target && target < nums[mid])
                {
                    right = mid-1;
                }
                else
                {
                    left = mid+1;
                }
            }
            else
            {
                //Now the right half must be sorted
                
                if (nums[mid]< target && nums[right]>=target)
                {
                    left = mid+1;
                }
                else
                {
                    right = mid - 1;
                }
            
            }
        }
        return -1;

    }
}