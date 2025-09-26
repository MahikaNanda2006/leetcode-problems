class Solution {
    public int removeElement(int[] nums, int val) {
        int x = nums.length;
        int counter = 0; //Counter
        int k=0; //write pointer
        for (int i=0; i<x; i++)
        {
            if(nums[i]!=val)
            {
                nums[k]=nums[i];
                k++;
                counter++;
            }
        }
        return counter;
    }
        
        
}