import java.util.ArrayList;
//import java.util.Scanner;
class Solution {
    int[] twoSum(int[] nums, int target) {
        int x= nums.length;
        
        ArrayList<Integer> abc = new ArrayList<Integer>();
        int counter=0;
        for (int i=0; i<x; i++)
        {
            for (int j=0; j<x; j++)
            {
                if(i==j)
                {
                    continue;
                }
                else
                {
                    if(nums[i]+nums[j]==target)
                    {
                        abc.add(i);
                        abc.add(j);
                        counter=1;
                        break;
                    }

                }
            }
            if (counter == 1)
            {
                break;
            }
        }
        int[] finalint = new int[abc.size()];
        for (int i=0; i<abc.size(); i++)
        {
            finalint[i]=abc.get(i);
        }
        return finalint;
        
    }

}