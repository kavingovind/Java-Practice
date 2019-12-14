import java.io.*;
import java.util.*;
import java.lang.*;

class Main
{
	public static void main (String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int tc=sc.nextInt();
		while(tc-->0)
		{
	    int i;
		  int n = sc.nextInt();
		  int arr[] = new int[n+1];
		  for(i=0; i<=n; i++)
		  {
		    arr[i] = sc.nextInt();
		  }
		  int d = sc.nextInt();
		  int k = sc.nextInt();
		  int x=0,c=0;
		  if(k>1)
		  {
		    for(i=1; i<k; i++)
		    {
		      c+=i*d;
    		  if(c>=k)
	    	  {
		        x=i;
		        break;
		      }
        }
	    }
      else
	    {
	      x=1;
		  }
		  long sum=0;
		  for(i=0; i<=n; i++)
		  {
		    sum+=arr[i]*Math.pow(x,i);
		  }
		  System.out.println(sum);
		}
	}
}
