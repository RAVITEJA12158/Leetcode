class Solution {
public:
    int smallestNumber(int n, int t) {
        for(int i=n;;i++)
        {
           int s=1;
           int n=i;
           while(n>0)
           {
             int p=n%10;
               s *=p;
               n=n/10;
           }
           if(s%t==0)
           {
             return i;
           }
        }
        return -1;
    }
};