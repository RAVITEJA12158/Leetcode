class Solution {
    public int majorityElement(int[] nums) {
        int t=0;
        int p=0;
        for(int i=0;i<nums.length;i++)
        {
            t=0;
             for(int j=0;j<nums.length;j++)
             {
                if(nums[i]==nums[j])
                {
                    t++;
                }
             }
             if(t>(nums.length/2))
             {
                p=i;
                break;
             }
        }
        return nums[p];
    }
}