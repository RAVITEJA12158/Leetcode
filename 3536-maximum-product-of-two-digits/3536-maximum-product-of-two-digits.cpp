class Solution {
public:
    int maxProduct(int n) {
        int max=0;
        int secmax=0;
        while(n>0)
        {
            int t=n%10;
            if(max<=t)
            {
                secmax=max;
                max=t;
            }
            if(t>secmax && t<max )
             secmax=t;
            n=n/10;
        }
        return max*secmax;
    }
};