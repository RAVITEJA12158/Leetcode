import java.util.*;
class Solution {
    public int findGCD(int[] nums) {
        Arrays.sort(nums);
        int a =nums[0];
        int b =nums[nums.length-1];
        int p=1;
        if(a%2==0 && b%2==0)
        {
            p=2;
            for (int i=4;i<=a;i+=2)
        {
             if(a%i==0 && b%i==0)
        {
            p=i;
        }
        }
        }
        else{
        for (int i=3;i<=a;i+=2)
        {
             if(a%i==0 && b%i==0)
        {
            p=i;
        }
        }
        }
         return p;
    }
}