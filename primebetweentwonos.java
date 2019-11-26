/*--Program to print prime numbers between two intervals--*/

import java.util.*;
import java.lang.*;
import java.io.*;

public class primebetweentwonos
{
	public static void main(String args[])
	{
		Scanner ip = new Scanner(System.in);
		int i,num;
    int start=ip.nextInt();
    int end=ip.nextInt();
		for(num=start; num <= end ;num++)
		{	
	    int flag=0;
	    for(i=2; i <= num/2; i++)
			{
      	if(num%i==0)  				
				{
	      	flag=1;
					break;
				}
    	}
    	if(flag==0)
    	{
		  	System.out.println(num+" ");
			}
		}
	}
}
