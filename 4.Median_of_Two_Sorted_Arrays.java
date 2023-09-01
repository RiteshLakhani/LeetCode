class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) 
    {
        int nums3 [] = new int[nums1.length+nums2.length];

        for(int i=0;i<nums1.length;i++)
        {
            nums3[i] = nums1[i];
        }    

        for(int i=0;i<nums2.length;i++)
        {
            nums3[nums1.length+i] = nums2[i];
        }

        for (int i = 0; i < nums3.length - 1; i++)
        {
            for (int j = 0; j < nums3.length - i - 1; j++)
            {
                if (nums3[j] > nums3[j + 1]) 
                {                  
                    int temp = nums3[j];
                    nums3[j] = nums3[j + 1];
                    nums3[j + 1] = temp;
                }
            }
        }
        double b;
        if((nums3.length)%2==0)
        {
            int a = (nums3.length)/2;
            b = (double)((nums3[a-1]+nums3[a]));
            b = b/2;
        } 
        else
        {
            int a = (nums3.length)/2;
            b = (double)nums3[a];
        }
        
        return b;
    }

    public static void main(String[]args)
    {
        Solution s1 = new Solution();
        int []nums1 = {1,3};
        int []nums2 = {2,7}; 
        System.out.println(s1.findMedianSortedArrays(nums1, nums2));  
    }
}
