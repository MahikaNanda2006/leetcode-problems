class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;
        
        int uniquePos = 0; // Points to the last unique element found
        
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[uniquePos]) {
                uniquePos++;
                nums[uniquePos] = nums[i]; // Move unique element forward
            }
        }
        
        return uniquePos + 1; // number of unique elements
    }
}
