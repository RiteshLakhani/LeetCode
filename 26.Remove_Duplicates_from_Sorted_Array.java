class Solution {
    public int removeDuplicates(int[] nums) 
    {
        Arrays.sort(nums);

        int x = 0 ;

        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]!=nums[x])
            {
                nums[++x] = nums[i];
            }
        }
            return x+1;
    }
}
