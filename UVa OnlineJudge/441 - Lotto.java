import java.io.*;
import java.util.*;
import java.lang.*;

class Main
{
	public static void main (String[] args)
	{
		Scanner ip=new Scanner(System.in);
        int count=0;
        while(true)
        {
		  int arrsize=ip.nextInt();
          if(arrsize==0)
          {
            return;
          }
          else if(count!=0)
          {
            System.out.println();
          }
          count++;
	      int arr[]=new int[arrsize];
	      for(int i=0;i<arrsize;i++)
	      {
    	  	arr[i]=ip.nextInt();
	      }
	      for(int i=0;i<arrsize;i++)
	      {
          	for(int j=i+1;j<arrsize;j++)
            {
               for(int k=j+1;k<arrsize;k++)
               {
                  for(int l=k+1;l<arrsize;l++)
                  {
                     for(int m=l+1;m<arrsize;m++)
                     {
                        for(int n=m+1;n<arrsize;n++)
                        {
                        	System.out.println(arr[i]+" "+arr[j]+" "+arr[k]+" "+arr[l]+" "+arr[m]+" "+arr[n]);   
                        }
                     }
                  }
               }
             }
	       }
	    }
	}
}
