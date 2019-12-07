import java.util.*;
import java.io.*;
import java.lang.*;

class Main
{
  public static void main(String args[])
  {
    Scanner ip=new Scanner(System.in);
    int tc=ip.nextInt();
    for(int t=0;t<tc;t++)
    {
      int n=ip.nextInt();
      int a[]=new int[n];
      for(int i=0;i<n;i++)
      {
	     a[i]=ip.nextInt();
      }
      int count=0;
      for(int i=0;i<n-1;i++)
      {
        for(int j=i+1;j<n;j++)
        {
	  if(a[i]<=a[j])
            count++;
	}
      }
      System.out.println(count);
    }
  }
}
