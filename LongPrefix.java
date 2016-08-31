package pro_LEVEL;

import java.util.*;
public class LongPrefix
{
public static void main(String ar[])throws Exception
{
Scanner sc=new Scanner(System.in);
int n,j;
n=sc.nextInt();
String a[]=new String[100];
for(int i=0;i<n;i++)
{
a[i]=sc.next();
}
String lng = "",check;
if(a.length>0)
lng=a[0];
for(int i=1;i<a.length;i++)
{
check=a[i];
for(j=0;j<Math.min(lng.length(),a[i].length());j++)
{
if(lng.charAt(j)!=check.charAt(j))
break;
}
lng=a[i].substring(0,j);
}
System.out.println("longest prefix is:"+lng);
}
}