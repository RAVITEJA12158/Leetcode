class Solution {
public:
    bool checkDivisibility(int n) {
       int p=n;
       int s=0;
       int pr=1;
       while(p>0)
       {
         int t=p%10;
         pr *=t;
         s +=t;
         p=p/10;
       } 
       if(n%(pr+s)==0)
        return true;
        return false;
    }
};