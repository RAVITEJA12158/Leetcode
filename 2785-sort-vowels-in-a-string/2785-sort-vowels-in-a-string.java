class Solution {
    public String sortVowels(String s) {
        int n=s.length();
    List<Character> list=new ArrayList<>(); 
        for(int i=0;i<n;i++)
        {
             if(s.charAt(i)=='a'||s.charAt(i)=='A'||s.charAt(i)=='e'||s.charAt(i)=='E'||s.charAt(i)=='i'||s.charAt(i)=='I'||s.charAt(i)=='o'||s.charAt(i)=='O'||s.charAt(i)=='u'||s.charAt(i)=='U')
             {
 list.add(s.charAt(i));
             }
             
        }
       char[] t=new char[s.length()];
        int k=0;
        int p=0;
       Collections.sort(list);
        for(int i=0;i<n;i++)
        {
            if(s.charAt(i)=='a'||s.charAt(i)=='A'||s.charAt(i)=='e'||s.charAt(i)=='E'||s.charAt(i)=='i'||s.charAt(i)=='I'||s.charAt(i)=='o'||s.charAt(i)=='O'||s.charAt(i)=='u'||s.charAt(i)=='U')
             {
                t[k++]=list.get(p++);
             }
             else{
                 t[k++]=s.charAt(i);
             }
        }
        String w=new String(t);
        return w;
    }
}