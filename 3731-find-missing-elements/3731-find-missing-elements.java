import java.util.*;
class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        Arrays.sort(nums);
        int i=nums[0];
        int j=nums[nums.length-1];
       ArrayList<Integer> ar = new ArrayList<>();
        ArrayList<Integer> ar1 = new ArrayList<>();
for (int x : nums) {
    ar.add(x);
}
for (int p=i;p<j;p++)
{
    if(!(ar.contains(p)))
    {
        ar1.add(p);
    }
}
return ar1;
    }
}