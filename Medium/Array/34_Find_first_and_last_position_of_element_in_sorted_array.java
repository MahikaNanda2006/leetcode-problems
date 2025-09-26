class Solution 
{
    public int[] searchRange(int[] nums, int target) 
    {
        //We need to do this, in reality, with two loops, one for the left case and one for the right case
        //So we first create resultarr as before
        int[] resultarr = {-1, -1};
        //But now, we call a private method to add the required values
        resultarr[0] = limits(nums, target, true); //for the leftenmost
        resultarr[1] = limits(nums, target, false); //for the rightenmost
        return resultarr;        
    }
    //Now, we write the actual method
    private int limits(int[] nums, int target, boolean isLeft) //the last parameter checks if we are looking for the leftenmost
    //or the rightenmost
    {
        int bound = -1; //This is what we will return
        int left = 0; 
        int right = nums.length - 1;
        while (left<=right)
        {
            int mid = left + (right  - left)/2;
            if (nums[mid] == target)
            {
                bound = mid;
                //The problem is, when it becomes equal, we want to keep checking
                //In case of leftenmost, to see if it's the first
                //In case of rightenmost, to see if it's the last
                //So, new if conditions
                if (isLeft) //aka if it is true aka if we are looking for the leftenmost
                {
                    right = mid - 1;
                }
                else //aka if it is false aka if we are looking for the rightenmost
                {
                    left = mid + 1;
                }
            }
            //Now, if it isn't equal, we do the normal binary search thing
            else if(nums[mid]<target)
            {
                left = mid + 1;
            }
            else
            {
                right = mid - 1;
            }
        }
        return bound;
    }
}