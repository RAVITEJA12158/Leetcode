class Solution {
    public String largestEven(String s) {
        int n=s.length();
        if(s.charAt(n-1)=='2')
            return s;
        StringBuilder sb=new StringBuilder();
        int p=0;
        int k=0;
        for(int i=n-1;i>=0;i--)
            {
                if(s.charAt(i)=='2'){
                    p=i;
                    k=1;
                    break;
                }
            }
        if(k==0)
            return sb.toString();
        for(int i=0;i<=p;i++)
            {
               sb.append(s.charAt(i));
            }
        return sb.toString();
    }
}