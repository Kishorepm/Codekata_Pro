package pro_LEVEL;
import java.util.*;
public class LongPrefix
{
public static void main(String ar[])throws Exception
{
  Scanner s=new Scanner(System.in);
  int n,j;
  n=s.nextInt();
  String a[]=new String[500];
  for(int i=0;i<n;i++)
    {
      a[i]=s.next();
    }
  String longprifix = "",check;
  if(a.length>0)
    longprifix=a[0];
   for(int i=1;i<a.length;i++)
   {
      check=a[i];
      for(j=0;j<Math.min(lng.length(),a[i].length());j++)
         {
          if(longprifix.charAt(j)!=check.charAt(j))
          break;
          }
        longprefix=a[i].substring(0,j);
    }
  System.out.println("longest prefix is:"+longprefix);
  }
}
