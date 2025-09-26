class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] arr3 = new int[m];
        int x=0;
        int y=0;
        for (int i =0; i<m; i++)
        {
            arr3[i] = nums1[i];
        }
        for (int i=0; i<m+n; i++)
        {
            if(x<m && y<n)
            {
                if(arr3[x]<nums2[y])
                {
                    nums1[i]=arr3[x];
                    x++;
                }
                else
                {
                    nums1[i]=nums2[y];
                    y++;
                }

            }
            else
            {
                if(x==m && y!=n)
                {
                    nums1[i]=nums2[y];
                    y++;
                }
                else
                {
                    nums1[i] = arr3[x];
                    x++;
                }
            }
            
        }
    }
}