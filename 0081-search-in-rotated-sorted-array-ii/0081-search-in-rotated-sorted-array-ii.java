class Solution {
    public boolean search(int[] nums, int target) {
        List<Integer> list=new ArrayList<>();
    for(int i=0;i<nums.length;i++)
    {
        list.add(nums[i]);
    }
        if(list.contains(target))
          return true;
          return false;
    }
}