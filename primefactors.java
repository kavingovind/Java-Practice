/*--Program to print prime factors of N--*/

import java.util.*;
import java.lang.*;
import java.io.*;

public class primefactors
{
	public static void main(String args[])
	{
		Scanner ip = new Scanner(System.in);
		int i,j;
    int num=ip.nextInt();
    for(i=1; i <= num/2; i++)
		{
			if(num%i==0)
			{
				int flag=0;
				for(j=2;j<=i/2;j++)
				{
      		if(i%j==0)  				
					{
	      		flag=1;
					}
				}
				if(flag==0)
	    	{	
				  System.out.println(i+" ");
	    	}
	    }
    }
  }
}
    
