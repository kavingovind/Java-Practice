/*-- Java Program to draw Interesting Pattern 1 like below--*/

import java.util.*;
import java.lang.*;
import java.io.*;

public class interestingpattern1
{
	public static void main(String args[])
	{
		Scanner ip = new Scanner(System.in);
		int i,j,k=1;
		System.out.print("Enter the number ");
    int n=ip.nextInt();
		for(i=1;i<=2*n-1;i++)
		{
			for(j=1;j<=k;j++)
			{
				System.out.print("*");
			}
			if(i<n)
			{
				k=k+1;
			}
			else	
			{
				k=k-1;
			}
			System.out.println();
		}
  }
}

