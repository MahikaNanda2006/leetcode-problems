class Solution 
{
    public String longestCommonPrefix(String[] strs)
    {
        int x = strs.length;
        if (x>0)
        {
            int min = strs[x-1].length();
            int pointer = x-1;
            for (int i = 0; i<x ; i++)
            {
                if(strs[i].length()< min )
                {
                    min = strs[i].length();
                    pointer = i;
                }

            }
            int prefixlen =0;
            for (int i =0 ; i<min; i++)
            {
                char currentChat = strs[pointer].charAt(i);
                for (int j = 0; j<x; j++)
                {
                    
                        String abc = strs[j];
                        if (abc.charAt(i)!=currentChat)
                        {
                            return strs[pointer].substring(0, prefixlen);
                        }
                        

                    
                    
                }
                prefixlen++;
            }
            return strs[pointer].substring(0, prefixlen);
        }
        
        return "";
    }
}
