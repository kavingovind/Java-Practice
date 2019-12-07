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
      int a=ip.nextInt();
      int b=ip.nextInt();
      int c=ip.nextInt();
      boolean flag=false;
      for(int x=-22;x<=22 && !flag;x++)
      {
        for(int y=-100;y<=100&& !flag;y++)
        {
          if(x!=y && ((x*x)+(y*y)<=c))
          {
            int z=a-x-y;
            if(x!=z && y!=z  && ((x*y*z)==b) &&  ((x*x)+(y*y)+(z*z))==c)
            {
              flag=true;
              System.out.println(x+" "+y+" "+z);
            }
          }
        }
      }
      if(!flag)
        System.out.println("No solution.");
    }
  }
}
