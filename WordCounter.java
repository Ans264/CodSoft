import java.util.*;
public class Main 
{ 
    public static void main(String args[])
    {
        Scanner so=new Scanner(System.in);
        System.out.println("Enter a text:");
        String s=so.nextLine();
        s=s+" ";
         int c=0;
         int c1=0;
         int c2=0;
        int l=s.length();
        char ch;
        for(int i=0;i<l;i++)
        {
            ch=s.charAt(i);
            if(ch==' ')
            {
              c=c+1;  
            }
        }
         System.out.println("Total no. of words:"+c);
         String ar[]=new String[c];
         int m=0;
               for(int j=0;j<l;j++)
               {
                  ch=s.charAt(j);
                  if(ch==' ')
                {  
                    c2=j+1;
                    ar[m]=s.substring(c1,c2-1);
                    m=m+1;
                    c1=c2;
                }
          }
          for(int k=0;k<c;k++)
         {
             System.out.println(ar[k]);
         }
    }
}