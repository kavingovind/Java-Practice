/*-- Java Program to draw Inverse Pyramid Pattern--*/

import java.util.*;
import java.lang.*;
import java.io.*;

public class inversepyramid
{
	public static void main(String args[])
	{
		Scanner ip = new Scanner(System.in);
		int i,j,k;
		System.out.print("Enter the number ");
    int n=ip.nextInt();
		for(i=0;i<n;i++)
		{
			for(k=0;k<i;k++)
      {
        System.out.print(" ");
      }
			for(j=2*n-i-1;j>i;j--)
			{
				System.out.print("*");
			}			
			System.out.println();
		}
  }
}

