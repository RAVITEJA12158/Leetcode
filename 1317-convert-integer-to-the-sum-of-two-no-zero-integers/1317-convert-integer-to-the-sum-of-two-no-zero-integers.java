class get{
   boolean result(int a){
     while(a>0)
     {
      int  n=a%10;
        if(n==0)
         return false;
         a=a/10;
     }
     return true;
}
}
class Solution {

    public int[] getNoZeroIntegers(int n) {
        int ab[]=new int[2];
for(int i=1;i<n;i++)
{
    get g=new get();
    int a=i;
    int b=n-a;
    if((g.result(a)) && (g.result(b)))
    {
           ab[0]=a;
           ab[1]=b;
           return ab;
    }
}
return ab;
    }
}