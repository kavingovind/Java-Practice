/*--Program to print the perfect numbers between two intervals--*/

import java.util.*;
import java.lang.*;
import java.io.*;

public class perfectnumbetweentwonos
{
	public static void main(String args[])
	{
		Scanner ip = new Scanner(System.in);
		int i;
    int start=ip.nextInt();
    int end=ip.nextInt();
		for(int number=start;number<=end;number++)
		{
			int sum=0;
    	for(i=1; i <= number/2; i++)
			{
    	  if(number%i==0)  				
				{
	  	    sum+=i;
				}
    	}
			if(sum==number)
			{
				System.out.print(number+" ");
			}
		}
  }
}
