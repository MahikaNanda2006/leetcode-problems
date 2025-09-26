class Solution 
{
    public int romanToInt(String s) 
    {
       HashMap<Character , Integer> hash = new HashMap<>();
        hash.put('I' , 1);        
        hash.put('V' , 5);
        hash.put('X' , 10);
        hash.put('L' , 50);
        hash.put('C' , 100);
        hash.put('D' , 500);
        hash.put('M' , 1000);
        int sum =0;
        int x = s.length();
        int[] arr_of_Roman_Values = new int[x];
        for (int i =0; i<x; i++)
        {
            arr_of_Roman_Values[i] = hash.get(s.charAt(i));
        }
        for (int i= 0; i<x; i++)
        {
        	if(i+1 < x)
        	{
        		 if (arr_of_Roman_Values[i]<arr_of_Roman_Values[i+1])
                 {
                     sum = sum - arr_of_Roman_Values[i];
                     //System.out.println(sum);
                 }
                 else
                 {
                     sum = sum+ arr_of_Roman_Values[i];
                     //System.out.println(sum);
                 }
        		
        	}
        	else
        	{
        		sum = sum+ arr_of_Roman_Values[i];
                //System.out.println(sum);
        		
        	}
        	
           
        }
        return sum;
    }
}